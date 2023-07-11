import java.util.Scanner;

public class i {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int n = inpt.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inpt.nextInt();
        }
        inpt.close();

        int total = 0;
        for (int i : arr) {
            total += i;
        }

        int minDiff = diff(arr, 0, 0, total);
        System.out.println(minDiff);
    }

    public static int diff(int[] arr, int i, int temp, int total) {
        if (i == arr.length) {
            return Math.abs(temp - (total - temp));
        }

        int pile1 = diff(arr, i + 1, temp + arr[i], total);
        int pile2 = diff(arr, i + 1, temp, total);

        return Math.min(pile1, pile2);
    }
}
