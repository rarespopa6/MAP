import java.util.ArrayList;
import java.util.Arrays;

public class Aufgabe2 {
    private int n;
    private int[] array;

    public Aufgabe2(int n, int[] array) throws Exception{
        this.n = n;

        if (n != array.length){
            throw new Exception("Invalid array length.");
        }

        this.array = array;
    }

    public int getMaxNumber(){
        return Arrays.stream(array)
                .max()
                .orElse(0);
    }

    public int getMinNumber(){
        return Arrays.stream(array)
                .min()
                .orElse(0);
    }

    public int getMaxSumOfAllExceptLowest(){
        int lowestNumber = getMinNumber();
        return Arrays.stream(array)
                .sum() - lowestNumber;
    }

    public int getMinSumOfAllExceptHighest(){
        int highestNumber = getMaxNumber();
        return Arrays.stream(array)
                .sum() - highestNumber;
    }
}
