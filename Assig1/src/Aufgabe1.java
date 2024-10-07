import java.text.DecimalFormat;
import java.util.Arrays;

public class Aufgabe1 {
    public int[] getLowGrades(int[] grades){
        return Arrays.stream(grades)
                .filter(grade -> grade < 40)
                .toArray();
    }

    public double getAverageGrade(int[] grades){
        if (grades.length == 0) {
            return 0;
        }

        double average = (double) Arrays.stream(grades).sum() / grades.length;
        DecimalFormat df = new DecimalFormat("#.00"); // genau 2 Ziffern nach Komma
        return Double.parseDouble(df.format(average));
    }

    public int[] getRoundedGrades(int[] grades){
        return Arrays.stream(grades)
                .map(grade -> (grade % 5 > 2 && grade >= 38 ) ? grade + (5 - (grade % 5)) : grade)
                .toArray();
    }

    public int getMaxRoundedGrade(int[] grades){
        return Arrays.stream(getRoundedGrades(grades))
                .max()
                .orElse(0); // falls grades leer ist
    }
}
