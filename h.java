import java.util.Scanner;

public class h {

    public static void Subset(int n, int m, int[] arr) {
        int allSubs = 1<<n;
        
        for (int i = 0; i < allSubs; i++) {
            int sum = 0,index = 0;
            int[] subset = new int[n];

            for (int j = 0; j < n; j++) {
                if ((i & 1<<j) !=0) {
                    subset[index++] = arr[i];
                    sum += subset[i];
                }
            }

            if (m == sum) {
                for (int j : subset) {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        try (Scanner inpt = new Scanner(System.in)) {
            int t = inpt.nextInt();
            while (t-- > 0) {
                int n, m;
                n = inpt.nextInt();
                m = inpt.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = inpt.nextInt();
                }

                Subset(n, m, arr);
            }
        }
    }
}
