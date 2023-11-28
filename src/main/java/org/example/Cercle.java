package org.example;

public class Cercle extends FiguraGeometrica {
    private double radi;

    public Cercle(String color, double radi) {
        super(color);
        try {
            setRadi(radi);
        } catch (IllegalArgumentException e) {
            System.err.println("Error setting number: " + e.getMessage());
        }
    }

    public double getRadi() {
        return radi;
    }

    private void setRadi(double radi) throws IllegalArgumentException {
        if (radi < 0) throw new IllegalArgumentException(INVALID_NUMBER);
        this.radi = radi;
    }

    public double calcArea() {
        return (Math.PI * (radi * radi));
    }


    public double calcPerimeter() {
        return (2 * Math.PI * radi);
    }

    @Override
    public String toString() {
        return "Color: " + getColor() + "\nArea: " + calcArea() + "\nPerimeter: " + calcPerimeter() + "\n";
    }
}