import models.Encontrar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Encontrar encontrar = new Encontrar();
        int num1, num2, num3;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        num3 = entrada.nextInt();

        encontrar.setNum1(num1);
        encontrar.setNum2(num2);
        encontrar.setNum3(num3);
        System.out.println(encontrar.obtenerMayor());

    }
}
