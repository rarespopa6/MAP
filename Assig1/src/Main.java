import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Aufgabe 1
        Aufgabe1 aufgabe1 = new Aufgabe1();

        int[] grades = {29, 37, 38, 41, 84, 67};
        int[] lowGrades = aufgabe1.getLowGrades(grades);
        System.out.println("Low Grades: " + Arrays.toString(lowGrades));

        double averageGrade = aufgabe1.getAverageGrade(grades);
        System.out.println("Average Grade: " + averageGrade);

        int[] roundedGrades = aufgabe1.getRoundedGrades(grades);
        System.out.println("Rounded Grades: " + Arrays.toString(roundedGrades));

        int maxRoundedGrade = aufgabe1.getMaxRoundedGrade(grades);
        System.out.println("Max Rounded Grade: " + maxRoundedGrade);

        // Aufgabe 2
        try {
            int[] array = {4, 8, 3, 10, 17};
            Aufgabe2 aufgabe2 = new Aufgabe2(array.length, array);

            // Testare metode
            System.out.println("Max: " + aufgabe2.getMaxNumber());
            System.out.println("Min: " + aufgabe2.getMinNumber());
            System.out.println("Max sum (n-1): " + aufgabe2.getMaxSumOfAllExceptLowest());
            System.out.println("Min sum (n-1): " + aufgabe2.getMinSumOfAllExceptHighest());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}