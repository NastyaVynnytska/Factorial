import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int line = 1;
        int n = 1;
        while (line == 1) {

            try {
                n = inputN();
            } catch (InputMismatchException exception) {
                System.out.println("n MUST BE A NUMBER, NOT A LETTER");
                n = inputN();
            } finally {
                reverseFactoril(n);
            }
        }
    }

    /*public static int factoril(int n){
        if(n == 1)
            return 1;
        return factoril(n=1)*n;
    }*/

    public static void reverseFactoril(int a) {
        int n = 1;
        while (a != 1) {
            n++;
            if (a % n != 0) {
                System.out.println("Not factorial");
                n = 0;
                break;
            } else a = a / n;
        }
        System.out.println(n);
    }

    public static int inputN() {
        // System.out.println("Enter n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 0 || n == 0) {
            while (n < 0 || n == 0) {
                System.out.println("n should be >0. Enter it again: ");
                n = input.nextInt();
                if (n > 0) {
                    break;
                }
            }
        }
        return n;
    }

}
