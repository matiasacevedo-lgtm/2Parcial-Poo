/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Principal;

import Controlador.ControladorColegio;
import Modelo.Estudiante;
import Modelo.Profesor;

/**
 *
 * @author HP
 */

public class MainParcial {

    public static void main(String[] args) {
        ControladorColegio controlador = new ControladorColegio();

        Profesor profesor1 = new Profesor(
                "Carlos Ruiz", "Calle 10", "3001111111", "10/02/1980",
                "12345678", "Matematicas", 50000, 40
        );

        Profesor profesor2 = new Profesor(
                "Ana Torres", "Carrera 20", "3002222222", "15/08/1975",
                "87654321", "Lenguaje", 45000, 35
        );

        Estudiante estudiante1 = new Estudiante(
                "Luis Perez", "Barrio Centro", "3111111111", "20/05/2010",
                "E001", "10A"
        );

        Estudiante estudiante2 = new Estudiante(
                "Maria Gomez", "Barrio Norte", "3222222222", "11/07/2011",
                "E002", "9B"
        );

        controlador.agregarProfesor(profesor1);
        controlador.agregarProfesor(profesor2);
        controlador.agregarEstudiante(estudiante1);
        controlador.agregarEstudiante(estudiante2);

        System.out.println(controlador.generarReporteEstudiantes());
        System.out.println(controlador.generarReporteProfesoresOrdenados());
    }
}