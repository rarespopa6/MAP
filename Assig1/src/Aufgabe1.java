import java.text.DecimalFormat;
import java.util.Arrays;

public class Aufgabe1 {
    public int[] getLowGrades(int[] grades){
        if (grades.length == 0) {
            return new int[0];
        }

        int[] lowGrades = new int[grades.length];
        int j = 0;
        for (int i = 0; i < grades.length; i++){
            if (grades[i] < 40){
                lowGrades[j++] = grades[i];
            }
        }
        return Arrays.copyOfRange(lowGrades, 0, j);
    }

    public double getAverageGrade(int[] grades){
        if (grades.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < grades.length; i++){
            sum += grades[i];
        }

        double average = (double) sum / grades.length;
        DecimalFormat df = new DecimalFormat("#.00"); // genau 2 Ziffern nach Komma
        return Double.parseDouble(df.format(average));
    }

    public int[] getRoundedGrades(int[] grades) {
        int[] roundedGrades = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];

            if (grade % 5 > 2 && grade >= 38) {
                roundedGrades[i] = grade + (5 - (grade % 5));
            } else {
                roundedGrades[i] = grade;
            }
        }

        return roundedGrades;
    }


    public int getMaxRoundedGrade(int[] grades){
        int[] roundedGrades = getRoundedGrades(grades);
        int maxi = -1;

        for (int i = 0; i < roundedGrades.length; i++){
            maxi = Math.max(maxi, roundedGrades[i]);
        }

        return maxi;
    }
}
