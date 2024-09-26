package org.damc.dao;

import org.damc.interfaces.Sesion9;
import org.damc.models.Student;

import java.util.ArrayList;

public class StudentDao implements Sesion9 {
    ArrayList<Student> students = new ArrayList<>();

    @Override
    public boolean store (Object object){
        Student student = (Student) object;
        try{
            students.add(student);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public void findByName (String name){
        try{
            for(Student student : students){
                if(student.getName().equals(name)){
                    System.out.println(student);
                }
            }
            System.out.println("Student was not found");
        }catch (Exception e){
            System.out.println("An error has occurred during the execution of findByName method");
        }
    }

    public void showStudents(){
        for(Student student : students){
            System.out.println(student);
        }
    }

    public double calcMeanAge(){
        double mean = 0;
        if(!students.isEmpty()){
            for(Student student : students){
                mean += student.getAge();
            }
            return mean / students.size();
        }
        return mean;
    }
}
