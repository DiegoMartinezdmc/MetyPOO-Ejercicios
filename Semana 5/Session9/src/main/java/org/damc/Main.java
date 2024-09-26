package org.damc;

import org.damc.dao.StudentDao;
import org.damc.models.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDao students = new StudentDao();

        Scanner sc = new Scanner(System.in);
        int option = 0;
        String menu = "1. Add student\n" +
                "2. Find student\n" +
                "3. Show students\n" +
                "4. Exit program\n" +
                "Enter your choice:";
        while (option != 5) {
            System.out.println(menu);
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the name of the student: ");
                    String name = sc.next();
                    System.out.println("Enter the age of the student: ");
                    int age = sc.nextInt();
                    System.out.println("Enter the email address of the student: ");
                    String email = sc.next();
                    Student student = new Student(name, age, email);
                    students.store(student);
                    break;
                case 2:
                    System.out.println("Enter the name of the student: ");
                    String nameToFind = sc.next();
                    students.findByName(nameToFind);
                    break;
                case 3:
                    students.showStudents();
                    break;
                case 4:
                    System.out.println("Thank you for using the program!");
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Please enter a valid option!");
                break;
            }
        }
    }
}