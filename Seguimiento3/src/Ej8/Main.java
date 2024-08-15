package Ej8;

public class Main {
    public static void main(String[] args) {
        Concierto concierto = new Concierto(10, 5);

        concierto.agregarEntrada(new Entrada(1, "GENERAL", 50.0));
        concierto.agregarEntrada(new Entrada(2, "GENERAL", 50.0));
        concierto.agregarEntrada(new Entrada(3, "VIP", 100.0));
        concierto.agregarEntrada(new Entrada(4, "VIP", 100.0));
        concierto.agregarEntrada(new Entrada(5, "VIP", 100.0));


        concierto.mostrarDisponibilidad();


        concierto.venderEntrada("GENERAL");
        concierto.venderEntrada("VIP");

        concierto.mostrarDisponibilidad();

        concierto.registrarIngreso(1);
        concierto.registrarIngreso(3);

        concierto.registrarIngreso(2);
    }
}
