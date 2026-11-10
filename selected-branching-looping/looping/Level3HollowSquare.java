import java.util.Scanner;

public class Level3HollowSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the square size N: ");
        int n = input.nextInt();

        if (n < 1) {
            System.out.println("N must be positive");
            return;
        }

        System.out.println("Hollow square:");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}
