import modelos.Admission;
import modelos.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Admission admission = new Admission();
        Scanner sc = new Scanner(System.in);
        float promedio;
        for (int i = 0; i < 5; i++) {
            Student student = new Student();
            System.out.println("Ingrese el promedio del estudiante ");
            promedio = sc.nextFloat();
            student.setAverage(promedio);
            admission.calcScholarship(student);
            System.out.println(student.isScholarship());
            students.add(student);
        }
        for (Student student : students) {
            System.out.println(student.getAverage() + " " + student.isScholarship());
        }
    }
}
