package Ej6;

public class Inventario {
        private Zapato zapato;
        private int[] tallas;
        private int[] cantidades;

        public Inventario(Zapato zapato, int[] tallas, int[] cantidades) {
            this.zapato = zapato;
            this.tallas = tallas;
            this.cantidades = cantidades;
        }

        public Zapato getZapato() {
            return zapato;
        }

        public int getCantidadPorTalla(int talla) {
            for (int i = 0; i < tallas.length; i++) {
                if (tallas[i] == talla) {
                    return cantidades[i];
                }
            }
            return 0;
        }

        public void registrarEntrada(int talla, int cantidad) {
            for (int i = 0; i < tallas.length; i++) {
                if (tallas[i] == talla) {
                    cantidades[i] += cantidad;
                }
            }
        }

        public void registrarSalida(int talla, int cantidad) {
            for (int i = 0; i < tallas.length; i++) {
                if (tallas[i] == talla) {
                    cantidades[i] -= cantidad;
                }
            }
        }

    }
