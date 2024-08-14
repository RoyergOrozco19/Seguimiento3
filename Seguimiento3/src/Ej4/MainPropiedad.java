package Ej4;

import javax.swing.*;

public class MainPropiedad {

    public static void main(String[] args) {


        Propiedad casa1 = new Propiedad("AA10", "Cra 18, avenida Siempre Viva", 60 , 140000000, 4, 2, true, "En Venta" );
        Propiedad casa2 = new Propiedad("AA20", "Avenida las Llamas #47-52", 68, 155000000, 5, 1, true, "En Venta" );
        Propiedad casa3 = new Propiedad("AA30", "Barrio las Chihuahuas #23-10", 55, 130000000, 3, 2, false, "En Venta");

        Propiedad[] casas = {casa1, casa2, casa3};

        for( Propiedad propiedades : casas){
            propiedades.mostrarDatos();
        }

        casa1.setEstado("Vendida");

        JOptionPane.showMessageDialog(null, "Datos de Casas Actualizados: ");
        for ( Propiedad propiedades : casas){
            propiedades.mostrarDatos();
        }


    }
}
