import java.util.Scanner;

public class StringSeparator {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] words = input.split("\\s+");

        for (String word : words) {
            String consonants = word.replaceAll("[aeiouAEIOU]", ""); // Remove vowels
            String vowels = word.replaceAll("[^aeiouAEIOU]", ""); // Keep only vowels

            System.out.println(word + ":");
            System.out.println(consonants + "-" + consonants.length());
            System.out.println(vowels + "-" + vowels.length());
            System.out.println();
        }
    }
}
