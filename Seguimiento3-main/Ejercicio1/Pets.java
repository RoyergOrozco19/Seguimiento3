package Ejercicio1;

public class Pets {
    private String name;
    private int age;
    private String race;
    private String color;

    public Pets(String name, int age, String race, String color) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
