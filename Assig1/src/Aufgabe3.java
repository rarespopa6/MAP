import java.util.Arrays;

public class Aufgabe3 {
    private int[] array1;
    private int[] array2;

    public Aufgabe3(int[] array1, int[] array2){
        this.array1 = array1;
        this.array2 = array2;
    }

    public int[] getSum() {
        int[] result = new int[array1.length + 1];
        int carry = 0;

        for (int i = array1.length - 1; i >= 0; i--) {
            int sum = array1[i] + array2[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }

        result[0] = carry;
        return result[0] == 0 ? Arrays.copyOfRange(result, 1, result.length) : result;
    }

    public int[] getDifference() {
        int[] result = new int[array1.length];
        int borrow = 0;

        for (int i = array1.length - 1; i >= 0; i--) {
            int diff = array1[i] - array2[i] - borrow;

            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result[i] = diff;
        }

        return result;
    }

    public int[] multiplyByDigit(int digit) {
        int[] result = new int[array1.length + 1];
        int carry = 0;

        for (int i = array1.length - 1; i >= 0; i--) {
            int product = array1[i] * digit + carry;
            result[i + 1] = product % 10;
            carry = product / 10;
        }

        result[0] = carry;
        return result[0] == 0 ? Arrays.copyOfRange(result, 1, result.length) : result;
    }

    public int[] divideByDigit(int digit) {
        int[] result = new int[array1.length];
        int carry = 0;

        for (int i = 0; i < array1.length; i++) {
            int current = carry * 10 + array1[i];
            result[i] = current / digit;
            carry = current % digit;
        }

        return result;
    }
}
