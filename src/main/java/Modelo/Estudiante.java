/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Estudiante extends Persona {

    private String codigoEstudiante;
    private String grado;

    public Estudiante(String nombre, String direccion, String telefono, String fechaNacimiento,
                      String codigoEstudiante, String grado) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.codigoEstudiante = codigoEstudiante;
        this.grado = grado;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "Estudiante -> " + super.toString() +
               ", Codigo: " + codigoEstudiante +
               ", Grado: " + grado;
    }
}