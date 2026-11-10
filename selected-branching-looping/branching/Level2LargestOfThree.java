import java.util.Scanner;

public class Level2LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();

        if (first == second && second == third) {
            System.out.println("All Numbers Are Equal");
        } else if (first >= second && first >= third) {
            System.out.println("Largest Number = " + first);
        } else if (second >= first && second >= third) {
            System.out.println("Largest Number = " + second);
        } else {
            System.out.println("Largest Number = " + third);
        }

        input.close();
    }
}
