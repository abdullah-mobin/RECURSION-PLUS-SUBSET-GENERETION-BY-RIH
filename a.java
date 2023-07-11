import java.util.Scanner;

public class a {
    public static void print(int n) {
        if (n > 1) {
            print(n - 1);
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n;
        try (Scanner inpuScanner = new Scanner(System.in)) {
            n = inpuScanner.nextInt();
        }
        print(n);
    }
}