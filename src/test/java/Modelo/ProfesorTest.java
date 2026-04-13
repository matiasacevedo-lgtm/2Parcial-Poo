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
public class ProfesorTest {

    @Test
    public void testCalcularPagoMensual() {
        Profesor profesor = new Profesor(
                "Carlos", "Calle 1", "3000000000", "01/01/1980",
                "123", "Matematicas", 10000, 10
        );

        assertEquals(130000, profesor.calcularPagoMensual());
    }

    @Test
    public void testCalcularPrestaciones() {
        Profesor profesor = new Profesor(
                "Carlos", "Calle 1", "3000000000", "01/01/1980",
                "123", "Matematicas", 10000, 10
        );

        assertEquals(24700, profesor.calcularPrestaciones());
    }
}