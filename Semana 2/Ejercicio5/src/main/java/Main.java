import models.Circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        double radio = sc.nextDouble();

        Circulo circulo = new Circulo(radio);

        double area = circulo.calcularArea();

        System.out.println("El area del circulo con radio " + radio + " es: " + area);
    }
}
