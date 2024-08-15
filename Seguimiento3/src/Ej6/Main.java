package Ej6;

public class Main {
    public static void main(String[] args) {
        Zapato[] zapatos = new Zapato[5];
        zapatos[0] = new Zapato("Modelo A", "Cuero", "Negro", 99.99, "Colección 2024");
        zapatos[1] = new Zapato("Modelo B", "Textil", "Marrón", 79.99, "Colección 2024");
        zapatos[2] = new Zapato("Modelo C", "Sintético", "Blanco", 59.99, "Colección 2024");
        zapatos[3] = new Zapato("Modelo D", "Cuero", "Azul", 89.99, "Colección 2024");
        zapatos[4] = new Zapato("Modelo E", "Textil", "Gris", 69.99, "Colección 2024");

        // Crear inventario
        Inventario[] inventario = new Inventario[5];
        inventario[0] = new Inventario(zapatos[0], new int[]{40, 41, 42, 43}, new int[]{10, 15, 20, 25});
        inventario[1] = new Inventario(zapatos[1], new int[]{40, 41, 42, 43}, new int[]{5, 10, 15, 20});
        inventario[2] = new Inventario(zapatos[2], new int[]{40, 41, 42, 43}, new int[]{12, 18, 24, 30});
        inventario[3] = new Inventario(zapatos[3], new int[]{40, 41, 42, 43}, new int[]{8, 16, 24, 32});
        inventario[4] = new Inventario(zapatos[4], new int[]{40, 41, 42, 43}, new int[]{20, 30, 40, 50});

        // Simular ventas
        Venta venta1 = new Venta(zapatos[0], 42, 2);
        inventario[0].registrarSalida(42, 2);

        Venta venta2 = new Venta(zapatos[2], 41, 1);
        inventario[2].registrarSalida(41, 1);

        // Imprimir inventario actual
        for (Inventario inv : inventario) {
            System.out.println(inv);
        }

        // Imprimir detalle de ventas realizadas
        venta1.imprimirDetalle();
        venta2.imprimirDetalle();
    }
}
