package Ejercicio7;

import java.util.Date;

public class BibliotecaMain {
    public static void main(String[] args) {
        Libro libro1 = new Libro("9786287611924", "El Perfume del Rey", "Karine Bernal", 2023, "Editorial Planeta", 608, "Fantasia romántica");
        Libro libro2 = new Libro("9789585531956", "De Sangre Y Cenizas", "Jennifer L. Srmentrout", 2022, "Puck", 667, "Romance juvenil");
        Libro libro3 = new Libro("9798400137259", "Damián: Un Secreto Oscuro y Perverso", "Alex Mírez", 2022, "independiente", 472, "Suspenso");

        Usuario usuario1 = new Usuario("Robert Downey Jr.", "3000458962", "555-1234");
        Usuario usuario2 = new Usuario("Sabrina Carpenter", "4578952185", "555-4789");

        Prestamo[] prestamos = new Prestamo[2];
        prestamos[0] = new Prestamo(libro1.getIsbn(), usuario1.getIdentificacion(), new Date(), null);
        prestamos[1] = new Prestamo(libro2.getIsbn(), usuario2.getIdentificacion(), new Date(), null);

        for (int i = 0; i < prestamos.length; i++) {
            System.out.println("ISBN del libro: " + prestamos[i].getIsbnLibro());
            System.out.println("ID del usuario: " + prestamos[i].getIdentificacionUsuario());
            System.out.println("Fecha de préstamo: " + prestamos[i].getFechaPrestamo());
            System.out.println("Fecha de devolución: " + prestamos[i].getFechaDevolucion());
        }
    }
}
