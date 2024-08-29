import models.Temperatura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double celsius, fahrenheit;
        Temperatura temp = new Temperatura();

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados celsius: ");
        celsius = sc.nextDouble();
        temp.setCelsius(celsius);
        fahrenheit = temp.convertirFarenheit();
        System.out.println("El temperatura es: " + fahrenheit);
    }
}
