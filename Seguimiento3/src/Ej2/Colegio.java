package Ej2;

import javax.swing.*;

public class Colegio {
    private String nombresEstudiante;
    private String apellidosEstudiante;
    private int edad;
    private int gradoEstudiante;
    private String nombreMadre;
    private String nombrePadre;
    private String telContacto;
    private String telContacto2;


    public Colegio(String nombresEstudiante, String apellidosEstudiante,int edad, int gradoEstudiante, String nombreMadre, String nombrePadre) {
        this.nombresEstudiante = nombresEstudiante;
        this.apellidosEstudiante = apellidosEstudiante;
        this.gradoEstudiante = gradoEstudiante;
        this.nombreMadre = nombreMadre;
        this.nombrePadre = nombrePadre;
        this.edad = edad;

    }
    public Colegio(String telContacto, String telContacto2) {
        this.telContacto = JOptionPane.showInputDialog(null, "Inserte el número de telefono");
        this.telContacto2 = JOptionPane.showInputDialog(null, "Inserte otro número de telefono");
    }
    public void datosEstudiante(){
        System.out.println("El estudiante: " + nombresEstudiante + apellidosEstudiante + "De grado " + gradoEstudiante + "Sus padres son :" + nombreMadre +  " y " + nombrePadre +  "info: " + telContacto +  " y " + telContacto2 );
    }

    public static void main(String[] args) {
        Colegio estudiante1 = new Colegio("Juan", "Lopez Gonzales", 17, 11, "Lina María", "Anthony");
        Colegio estudiante2 = new Colegio("Sofia", "Grajales Perez", 18, 11, "Lina María", "Anthony");
        Colegio estudiante3 = new Colegio("Maria Jose", "Estrada Salazar", 16, 10, "Lina María", "Anthony");
        estudiante1.datosEstudiante();
        estudiante2.datosEstudiante();
        estudiante3.datosEstudiante();
    }

}