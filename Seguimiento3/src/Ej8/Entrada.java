package Ej8;

public class Entrada {
    private int numeroEntrada;
    private String zona;
    private double valor;
    private boolean vendida;
    private boolean ingreso;

    public Entrada(int numeroEntrada, String zona, double valor) {
        this.numeroEntrada = numeroEntrada;
        this.zona = zona;
        this.valor = valor;
        this.vendida = false;
        this.ingreso = false;
    }

    public int getNumeroEntrada() {
        return numeroEntrada;
    }

    public void setNumeroEntrada(int numeroEntrada) {
        this.numeroEntrada = numeroEntrada;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isVendida() {
        return vendida;
    }

    public void setVendida(boolean vendida) {
        this.vendida = vendida;
    }

    public boolean isIngreso() {
        return ingreso;
    }

    public void setIngreso(boolean ingreso) {
        this.ingreso = ingreso;
    }
    public void marcarVendida(){
        this.vendida = true;
    }
    public void marcarIngreso() {
        if (vendida) {
            this.ingreso = true;
        } else {
            System.out.println("La entrada no ha sido vendida, no se puede marcar como ingreso.");

        }

    }
}
