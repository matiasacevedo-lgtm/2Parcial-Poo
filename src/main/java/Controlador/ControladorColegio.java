/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Estudiante;
import Modelo.Profesor;

/**
 *
 * @author HP
 */

public class ControladorColegio {

    private Profesor[] profesores;
    private Estudiante[] estudiantes;
    private int contadorProfesores;
    private int contadorEstudiantes;

    public ControladorColegio() {
        profesores = new Profesor[50];
        estudiantes = new Estudiante[100];
        contadorProfesores = 0;
        contadorEstudiantes = 0;
    }

    public void agregarProfesor(Profesor profesor) {
        if (contadorProfesores < profesores.length) {
            profesores[contadorProfesores] = profesor;
            contadorProfesores++;
        }
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (contadorEstudiantes < estudiantes.length) {
            estudiantes[contadorEstudiantes] = estudiante;
            contadorEstudiantes++;
        }
    }

    public String generarReporteEstudiantes() {
        StringBuilder reporte = new StringBuilder("REPORTE DE ESTUDIANTES\n");

        if (contadorEstudiantes == 0) {
            return reporte.append("No hay estudiantes registrados").toString();
        }

        for (int i = 0; i < contadorEstudiantes; i++) {
            reporte.append(estudiantes[i].toString()).append("\n");
        }

        return reporte.toString();
    }

    public String generarReporteProfesoresOrdenados() {
        StringBuilder reporte = new StringBuilder("REPORTE DE PROFESORES ORDENADOS POR SALARIO TOTAL\n");

        if (contadorProfesores == 0) {
            return reporte.append("No hay profesores registrados").toString();
        }

        Profesor[] copia = new Profesor[contadorProfesores];

        for (int i = 0; i < contadorProfesores; i++) {
            copia[i] = profesores[i];
        }

        for (int i = 0; i < copia.length - 1; i++) {
            for (int j = 0; j < copia.length - 1 - i; j++) {
                if (copia[j].calcularPagoMensual() < copia[j + 1].calcularPagoMensual()) {
                    Profesor aux = copia[j];
                    copia[j] = copia[j + 1];
                    copia[j + 1] = aux;
                }
            }
        }

        for (int i = 0; i < copia.length; i++) {
            reporte.append(copia[i].toString()).append("\n");
        }

        reporte.append("Total prestaciones sociales: ").append(calcularTotalPrestaciones());

        return reporte.toString();
    }

    public double calcularTotalPrestaciones() {
        double total = 0;

        for (int i = 0; i < contadorProfesores; i++) {
            total += profesores[i].calcularPrestaciones();
        }

        return total;
    }

    // Sobrecarga
    public String generarReporte() {
        return generarReporteEstudiantes();
    }

    public String generarReporte(String tipo) {
        if (tipo.equalsIgnoreCase("profesores")) {
            return generarReporteProfesoresOrdenados();
        }
        return generarReporteEstudiantes();
    }

    public Profesor[] getProfesores() {
        return profesores;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public int getContadorProfesores() {
        return contadorProfesores;
    }

    public int getContadorEstudiantes() {
        return contadorEstudiantes;
    }
}