/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */

public class Profesor extends Persona {

    private String cedula;
    private String area;
    private double salarioHora;
    private int horasMes;

    public Profesor(String nombre, String direccion, String telefono, String fechaNacimiento,
                    String cedula, String area, double salarioHora, int horasMes) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cedula = cedula;
        this.area = area;
        this.salarioHora = salarioHora;
        this.horasMes = horasMes;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasMes() {
        return horasMes;
    }

    public void setHorasMes(int horasMes) {
        this.horasMes = horasMes;
    }

    public double calcularPagoMensual() {
        double salarioBase = salarioHora * horasMes;
        double preparacion = salarioBase * 0.30;
        return salarioBase + preparacion;
    }

    // Sobrecarga
    public double calcularPagoMensual(boolean incluirPreparacion) {
        double salarioBase = salarioHora * horasMes;

        if (incluirPreparacion) {
            return salarioBase + (salarioBase * 0.30);
        }

        return salarioBase;
    }

    public double calcularPrestaciones() {
        return calcularPagoMensual() * 0.19;
    }

    @Override
    public String toString() {
        return "Profesor -> " + super.toString() +
               ", Cedula: " + cedula +
               ", Area: " + area +
               ", Salario Hora: " + salarioHora +
               ", Horas Mes: " + horasMes +
               ", Pago Mensual: " + calcularPagoMensual() +
               ", Prestaciones: " + calcularPrestaciones();
    }
}