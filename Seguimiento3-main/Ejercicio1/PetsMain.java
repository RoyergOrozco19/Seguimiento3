package Ejercicio1;

import javax.swing.*;

public class PetsMain {
    public static void main(String[] args) {
        Pets pet1 = new Pets("Sharol", 7, "Coker", "Brown");
        Pets pet2 = new Pets("Gema", 2, "Dalmata", "White and Black");
        Pets pet3 = new Pets("Gaya", 5, "Bulldog", "Brown");

        System.out.println("pet 1: " + pet1.getName() + ", " + pet1.getAge() + " years old, " + pet1.getRace() + ", " + pet1.getColor());
        System.out.println("pet 2:" + pet2.getName() + "," + pet2.getAge() + "years old," + pet2.getRace()+ "," + pet2.getColor());
        System.out.println("pet 3:" + pet3.getName() + "," + pet3.getAge() + "years old," + pet3.getRace()+ "," + pet3.getColor());

        pet1.setName("Max");
        pet1.setAge(4);
        pet1.setRace("Golden Retriever");
        pet1.setColor("Golden");

        System.out.println("pet 1-2" + pet1.getName()+ "," + pet1.getAge() + "years old," + pet1.getRace()+ "," + pet1.getColor());
    }

}
