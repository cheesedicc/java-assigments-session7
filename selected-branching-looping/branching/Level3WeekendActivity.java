import java.util.Locale;
import java.util.Scanner;

public class Level3WeekendActivity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter the temperature in Celsius: ");
        double temperature = input.nextDouble();
        System.out.print("Is it raining? (true/false): ");
        boolean raining = input.nextBoolean();

        if (raining) {
            System.out.println("Stay Indoors");
        } else if (temperature >= 20 && temperature <= 30) {
            System.out.println("Go for a Picnic");
        } else if (temperature > 30) {
            System.out.println("Go Swimming");
        } else {
            System.out.println("Take a Walk with a Jacket");
        }

        input.close();
    }
}
