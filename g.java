import java.util.Scanner;

public class g {

    public static boolean rec(int n, int x, int[] arr) {
        if (n == 1) {
            return arr[0] == x;
        }
        return rec(n - 1, x - arr[n - 1], arr) || rec(n - 1, x + arr[n - 1], arr);
    }

    public static void main(String[] args) {
        try (Scanner inpt = new Scanner(System.in)) {
            int n = inpt.nextInt();
            int x = inpt.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = inpt.nextInt();
            }

            if (rec(n, x, arr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
