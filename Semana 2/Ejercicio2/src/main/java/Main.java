import models.Numero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Numero num = new Numero();
        System.out.println("Ingrese un numero:");

        int dato;
        Scanner sc = new Scanner(System.in);
        dato = sc.nextInt();
        System.out.println(num.evaluarNumero(dato));
    }
}
