import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Aufgabe 1
        Aufgabe1 aufgabe1 = new Aufgabe1();

        int[] grades = {75, 40, 35, 29, 88, 57, 90, 38, 49};
        int[] lowGrades = aufgabe1.getLowGrades(grades);
        System.out.println("Low Grades: " + Arrays.toString(lowGrades));

        double averageGrade = aufgabe1.getAverageGrade(grades);
        System.out.println("Average Grade: " + averageGrade);

        int[] roundedGrades = aufgabe1.getRoundedGrades(grades);
        System.out.println("Rounded Grades: " + Arrays.toString(roundedGrades));

        int maxRoundedGrade = aufgabe1.getMaxRoundedGrade(grades);
        System.out.println("Max Rounded Grade: " + maxRoundedGrade);
    }
}