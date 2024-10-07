import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Aufgabe 1
        System.out.println("Aufgabe 1");
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
        System.out.println();
        System.out.println("Aufgabe 2");
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

        // Aufgabe 3
        System.out.println();
        System.out.println("Aufgabe 3");
        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        Aufgabe3 aufgabe3 = new Aufgabe3(num1, num2);
        System.out.println("Summe: " + Arrays.toString(aufgabe3.getSum()));

        int[] num3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num4 = {5, 4, 0, 0, 0, 0, 0, 0, 0};

        Aufgabe3 aufgabe3Diff = new Aufgabe3(num3, num4);

        System.out.println("Differenz: " + Arrays.toString(aufgabe3Diff.getDifference()));
        System.out.println("Multiplikation: " + Arrays.toString(aufgabe3.multiplyByDigit(2)));
        System.out.println("Division: " + Arrays.toString(aufgabe3.divideByDigit(2)));

        // Aufgabe 4
        System.out.println();
        System.out.println("Aufgabe 4");

        int[] usbPrices = {8, 12, 15};
        int[] keyboardPrices = {40, 50, 60};

        Aufgabe4 aufgabe = new Aufgabe4(usbPrices, keyboardPrices);

        System.out.println("Min Preis Tastaturen: " + aufgabe.getMinKeyboardPrice());
        System.out.println("Grosstes Preis aus beiden: " + aufgabe.getHighestPrice());

        int budget = 60;
        System.out.println("Teuresten USB, das er sich leisten kann " + budget + ": " + aufgabe.getMostExpensiveAffordableUsb(budget));

        System.out.println("Hochstens so viel kann er ausgeben" + ": " + aufgabe.getMaxSpent(budget));
    }
}