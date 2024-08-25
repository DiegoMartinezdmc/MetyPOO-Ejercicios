package notaUAM;

import modelos.Estudiante;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\u001B[32m");
        System.out.println("UAM");
        // Crear un objeto
        Estudiante est = new Estudiante();
        String nombres, apellidos, cif, asignatura;
        int nota1, nota2, nota3, nf;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa los siguientes datos:");
        System.out.println("CIF: ");
        cif = sc.nextLine();
        System.out.println("Nombres: ");
        nombres = sc.nextLine();
        System.out.println("Apellidos: ");
        apellidos = sc.nextLine();
        System.out.println("Asignatura: ");
        asignat = sc.nextLine();
        System.out.println("Corte 1: ");
        nota1 = Integer.parseInt(sc.nextLine());
        System.out.println("Corte 2: ");
        nota2 = Integer.parseInt(sc.nextLine());
        System.out.println("Corte 3: ");
        nota3 = Integer.parseInt(sc.nextLine());
        est.setCif(cif);
        est.setNombres(nombres);
        est.setApellidos(apellidos);
        est.setAsignatura(asignatura);
        est.setCorte1(nota1);
        est.setCorte2(nota2);
        est.setCorte3(nota3);
        nf = est.obNotaFinal();
        System.out.println("Nota final "+ nf);
        System.out.println(est.e);


    }
}
