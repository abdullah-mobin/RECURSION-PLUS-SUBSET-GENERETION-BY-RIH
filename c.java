import java.util.Scanner;

public class c {
    public static boolean check(long n) {
        if (n == 1) {
            return true;
        }

        if (n < 1 || n % 10 != 0 && n % 20 != 0) {
            return false;
        }

        return check(n / 10) || check(n / 20);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int t = input.nextInt();

            for (int i = 0; i < t; i++) {
                long n = input.nextLong(); 
                if (check(n)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
