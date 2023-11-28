package chatgpt.exemple;

import org.example.Cercle;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "x4", 2021, 60281.304, 4, "Gasoil");
        System.out.println(car1.getCombustibleType());
    }
}