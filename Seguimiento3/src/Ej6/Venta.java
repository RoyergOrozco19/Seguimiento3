package Ej6;

import java.time.LocalDate;

public class Venta {

        private LocalDate fecha;
        private Zapato zapato;
        private int talla;
        private int cantidad;
        private double valor;

        public Venta(Zapato zapato, int talla, int cantidad) {
            this.fecha = LocalDate.now();
            this.zapato = zapato;
            this.talla = talla;
            this.cantidad = cantidad;
            this.valor = calcularTotal();
        }

        public double calcularTotal() {
            return cantidad * zapato.getPrecio();
        }

        public void imprimirDetalle() {
            System.out.println("Venta realizada el " + fecha);
            System.out.println("Modelo: " + zapato.getNombre());
            System.out.println("Talla: " + talla);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Valor total: " + valor);
        }
    }
