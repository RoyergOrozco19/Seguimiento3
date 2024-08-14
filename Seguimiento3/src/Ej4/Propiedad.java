package Ej4;

import javax.swing.*;

public class Propiedad {
    private String idPropiedad;
    private String direccion;
    private int area;
    private int precio;
    private int cantidadHabitaciones;
    private int cantidadBanos;
    private boolean Garage;
    private String estado;

    public Propiedad(String idPropiedad, String direccion, int area, int precio, int cantidadHabitaciones, int cantidadBanos, boolean garage, String estado) {
        this.idPropiedad = idPropiedad;
        this.direccion = direccion;
        this.area = area;
        this.precio = precio;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.cantidadBanos = cantidadBanos;
        Garage = garage;
        this.estado = estado;

    }


    public String getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(String idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getCantidadBanos() {
        return cantidadBanos;
    }

    public void setCantidadBanos(int cantidadBaños) {
        this.cantidadBanos = cantidadBanos;
    }

    public boolean isGarage() {
        return Garage;
    }

    public void setGarage(boolean garage) {
        Garage = garage;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "ID de la casa: " + idPropiedad);
        JOptionPane.showMessageDialog(null, "Dirección: " + direccion);
        JOptionPane.showMessageDialog(null, "Area: " + area);
        JOptionPane.showMessageDialog(null, "Precio: " + precio);
        JOptionPane.showMessageDialog(null, "Cantidad de Habitaciones: " + cantidadHabitaciones);
        JOptionPane.showMessageDialog(null, "Numero de Baños: " + cantidadBanos);
        JOptionPane.showMessageDialog(null, "Garage: " + Garage);
        JOptionPane.showMessageDialog(null, "Estado de venta: " + estado);
    }

}
