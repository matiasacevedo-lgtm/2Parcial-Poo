/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Controlador;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Modelo.Estudiante;
import Modelo.Profesor;
/**
 *
 * @author HP
 */
public class ControladorColegioTest {

    @Test
    public void testAgregarYReportar() {
        ControladorColegio controlador = new ControladorColegio();

        Profesor profesor = new Profesor(
                "Carlos", "Calle 1", "3000000000", "01/01/1980",
                "123", "Matematicas", 10000, 10
        );

        Estudiante estudiante = new Estudiante(
                "Luis", "Centro", "3111111111", "20/05/2010",
                "E001", "10A"
        );

        controlador.agregarProfesor(profesor);
        controlador.agregarEstudiante(estudiante);

        String reporteEstudiantes = controlador.generarReporteEstudiantes();
        String reporteProfesores = controlador.generarReporteProfesoresOrdenados();

        assertTrue(reporteEstudiantes.contains("Luis"));
        assertTrue(reporteProfesores.contains("Carlos"));
    }
}