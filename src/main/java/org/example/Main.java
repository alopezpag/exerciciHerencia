package org.example;

public class Main {
    public static void main(String[] args) {
        Cercle cercle = new Cercle("Blue", 32.5);
        System.out.println("Area: " + cercle.calcArea());
        System.out.println("Perimetre: " + cercle.calcPerimeter());
        System.out.println("Color: " + cercle.getColor());
        System.out.println("---\n" + cercle + "---");
    }
}