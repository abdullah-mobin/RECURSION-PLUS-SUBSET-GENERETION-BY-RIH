import java.util.Scanner;

public class b {
    public static void digitPrinter(int n) {

        if (n < 10) {
            System.out.print(n + " ");
        } else {
            digitPrinter(n / 10);
            digitPrinter(n % 10);
        }
    }

    public static void main(String[] args) {
        try (Scanner inputScanner = new Scanner(System.in)) {
            int n = inputScanner.nextInt();
            //  ooooooo dammmnnnnn!!!! multi case :') 

            while (n-- > 0) {
                int number = inputScanner.nextInt();
                digitPrinter(number);
                System.out.println();
            }

        }
    }
}
