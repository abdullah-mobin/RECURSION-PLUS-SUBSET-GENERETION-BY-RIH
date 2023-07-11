import java.util.Scanner;

public class j {

    public static int sod(int number) {
        if (number < 10) {
            return number;
        } else {
            int sum = 0;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            return sod(sum);
        }
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number;
            do {
                number = input.nextInt();
                if(number==0)
                    return;
                System.out.println(sod(number));
            } while (number !=0);
        }
    }
}