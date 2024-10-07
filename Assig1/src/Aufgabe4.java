import java.util.Arrays;

public class Aufgabe4 {
    private int[] usb;
    private int[] keyboard;

    public Aufgabe4(int[] usb, int[] keyboard) {
        this.usb = usb;
        this.keyboard = keyboard;
    }

    public int getMinKeyboardPrice(){
        return Arrays.stream(keyboard)
                .min()
                .orElse(0);
    }

    public int getHighestPrice(){
        int mostExpensiveKeyboard = Arrays.stream(keyboard)
                .max()
                .orElse(0);

        int mostExpensiveUsb = Arrays.stream(usb)
                .max()
                .orElse(0);

        return Math.max(mostExpensiveKeyboard, mostExpensiveUsb);
    }

    public int getMostExpensiveAffordableUsb(int budget){
        int[] sorted = Arrays.stream(usb).sorted().toArray();

        for (int i = sorted.length - 1; i >= 0; i--) {
            if (sorted[i] <= budget) {
                return sorted[i];
            }
        }

        return -1; // falls es keine Usb gibt, die er sich leisten kann
    }

    public int getMaxSpent(int budget) {
        int maxSpent = -1;

        for (int keyboardPrice : keyboard) {
            for (int usbPrice : usb) {
                int totalSpent = keyboardPrice + usbPrice;

                if (totalSpent <= budget) {
                    maxSpent = Math.max(maxSpent, totalSpent);
                }
            }
        }

        return maxSpent;
    }
}
