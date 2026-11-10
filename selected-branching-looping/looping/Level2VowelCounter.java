import java.util.Scanner;

public class Level2VowelCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        int vowelCount = 0;

        for (int index = 0; index < sentence.length(); index++) {
            char letter = Character.toLowerCase(sentence.charAt(index));
            if (letter == 'a' || letter == 'e' || letter == 'i'
                    || letter == 'o' || letter == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Vowels = " + vowelCount);
        input.close();
    }
}
