package Lecture9;

import java.util.Arrays;

public class Student {
    String name;
    double[] grades;



    public Student(String name, double[] grades){
        this.name = name;
        this.grades = grades;
    }

    public double calculateGrades(){
        double sum =0;
        for(int i=0;i<grades.length;i++){
            sum += grades[i];
        }

        double average = sum / grades.length;
        return average;
    }

    public void showInfo(){
        System.out.println("The name of the student is " + name + " and the average of the grades is equal to " + calculateGrades());
    }
}
