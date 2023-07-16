import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            if (i % 2 != 0) {
                System.out.print(i);

                if (i != a - 1 && i != a) {
                    System.out.print(", ");
                }
            }
        }

        System.out.println();
    }
}
