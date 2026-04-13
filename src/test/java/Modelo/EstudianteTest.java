/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class EstudianteTest {

    @Test
    public void testDatosEstudiante() {
        Estudiante estudiante = new Estudiante(
                "Luis", "Centro", "3111111111", "20/05/2010",
                "E001", "10A"
        );

        assertEquals("Luis", estudiante.getNombre());
        assertEquals("E001", estudiante.getCodigoEstudiante());
        assertEquals("10A", estudiante.getGrado());
    }
}
