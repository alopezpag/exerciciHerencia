package org.example;

public class FiguraGeometrica {
    public static final String INVALID_STRING_NULL = "String can't be null.";
    public static final String INVALID_STRING_EMPTY = "String can't be empty.";
    public static final String INVALID_NUMBER = "Number can't be < 0.";

    private String color;

    public FiguraGeometrica(String color) {
        try {
            setColor(color);
        } catch (IllegalArgumentException e) {
            System.err.println("Error setting color: " + e.getMessage());
        }
    }


    public String getColor() {
        return color;
    }

    private final void setColor(String color) throws IllegalArgumentException {
        if (color == null) throw new IllegalArgumentException(INVALID_STRING_NULL);
        else if (color.isEmpty()) throw new IllegalArgumentException(INVALID_STRING_EMPTY);
        String formattedString = color.trim();
        formattedString = formattedString.replaceAll("\\s+", " ");
        this.color = formattedString;
    }

    private double calcArea() {
        return 0.0;
    }

    public double calcPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Color: " + getColor() + "\n";
    }
}
