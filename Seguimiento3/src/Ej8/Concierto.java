package Ej8;

import java.util.ArrayList;
import java.util.List;

public class Concierto {
        private List<Entrada> entradas;
        private int maxGeneral;
        private int maxVIP;
        private int currentGeneral;
        private int currentVIP;

        public Concierto(int maxGeneral, int maxVIP) {
            this.entradas = new ArrayList<>();
            this.maxGeneral = maxGeneral;
            this.maxVIP = maxVIP;
            this.currentGeneral = 0;
            this.currentVIP = 0;
        }

        public void agregarEntrada(Entrada entrada) {
            if (entrada.getZona().equalsIgnoreCase("GENERAL") && currentGeneral < maxGeneral) {
                entradas.add(entrada);
                currentGeneral++;
            } else if (entrada.getZona().equalsIgnoreCase("VIP") && currentVIP < maxVIP) {
                entradas.add(entrada);
                currentVIP++;
            } else {
                System.out.println("No hay disponibilidad en la zona " + entrada.getZona());
            }
        }

        public void venderEntrada(String zona) {
            for (Entrada entrada : entradas) {
                if (entrada.getZona().equalsIgnoreCase(zona) && !entrada.isVendida()) {
                    entrada.marcarVendida();
                    System.out.println("Entrada vendida: " + entrada.getNumeroEntrada());
                    return;
                }
            }
            System.out.println("No hay entradas disponibles en la zona " + zona);
        }

        public void registrarIngreso(int numeroEntrada) {
            for (Entrada entrada : entradas) {
                if (entrada.getNumeroEntrada() == numeroEntrada && entrada.isVendida()) {
                    entrada.marcarIngreso();
                    System.out.println("Ingreso registrado para la entrada: " + numeroEntrada);
                    return;
                }
            }
            System.out.println("No se encontró la entrada o no ha sido vendida.");
        }

        public void mostrarDisponibilidad() {
            int disponiblesGeneral = maxGeneral - currentGeneral;
            int disponiblesVIP = maxVIP - currentVIP;
            System.out.println("Disponibilidad General: " + disponiblesGeneral);
            System.out.println("Disponibilidad VIP: " + disponiblesVIP);
        }
    }
