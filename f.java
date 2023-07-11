import java.util.Scanner;

public class f {
    
    public static int way(int start, int end) {
        if (start > end) {
            return 0;
        } else if (start == end) {
            return 1;
        } else {
            int w = 0;
            w += way(start + 1, end);
            w += way(start + 2, end);
            w += way(start + 3, end);
            return w;
        }
    }
    public static void main(String[] args) {
        try (Scanner inpt = new Scanner(System.in)) {
            int start = inpt.nextInt();
            int end = inpt.nextInt();

            int w = way(start, end);
            System.out.println(w);
        }
    }
}
