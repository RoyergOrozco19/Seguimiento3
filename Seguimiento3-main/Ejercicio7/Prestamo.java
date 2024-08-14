package Ejercicio7;

import java.util.Date;

public class Prestamo {

    private String isbnLibro;
    private String identificacionUsuario;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    public Prestamo(String isbnLibro, String identificacionUsuario, Date fechaPrestamo, Date fechaDevolucion) {
        this.isbnLibro = isbnLibro;
        this.identificacionUsuario = identificacionUsuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getIsbnLibro() {
        return isbnLibro;
    }

    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }

    public String getIdentificacionUsuario() {
        return identificacionUsuario;
    }

    public void setIdentificacionUsuario(String identificacionUsuario) {
        this.identificacionUsuario = identificacionUsuario;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
