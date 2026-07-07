package session3.exercise1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentGradeTracker {

    static HashMap<String, ArrayList<Integer>> studentGrades = new HashMap<>();

    public static void main(String[] args) {

        addGrade("David", 80);
        addGrade("David", 90);

        addGrade("David", 70);
        addGrade("David", 75);

        addGrade("James", 95);
        addGrade("James", 100);

        printReport();

        String topStudent = findTopStudent();
        System.out.println("\nTop-performing student: " + topStudent);
    }

    public static void addGrade(String studentName, int grade) {
        if (!studentGrades.containsKey(studentName)) {
            studentGrades.put(studentName, new ArrayList<>());
        }

        studentGrades.get(studentName).add(grade);
    }

    public static double calculateAverage(String studentName) {
        ArrayList<Integer> grades = studentGrades.get(studentName);

        int total = 0;

        for (int grade : grades) {
            total = total + grade;
        }

        return (double) total / grades.size();
    }

    public static String findTopStudent() {
        String topStudent = "";
        double highestAverage = 0;

        for (Map.Entry<String, ArrayList<Integer>> entry : studentGrades.entrySet()) {
            String studentName = entry.getKey();
            double average = calculateAverage(studentName);

            if (average > highestAverage) {
                highestAverage = average;
                topStudent = studentName;
            }
        }

        return topStudent + " with average " + highestAverage;
    }

    public static void printReport() {
        System.out.println("Student Grade Report: ");

        for (Map.Entry<String, ArrayList<Integer>> entry : studentGrades.entrySet()) {
            String studentName = entry.getKey();
            ArrayList<Integer> grades = entry.getValue();
            double average = calculateAverage(studentName);

            System.out.println("Student: " + studentName);
            System.out.println("Grades: " + grades);
            System.out.println("Average: " + average);
            System.out.println();
        }
    }
}