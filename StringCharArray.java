import java.util.Scanner;

public class StringCharArray {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        // Splitting input into words
        String[] words = input.split("\\s+");

        // Processing each word
        for (String word : words) {
            char[] chars = word.toCharArray();
            StringBuilder consonants = new StringBuilder();
            StringBuilder vowels = new StringBuilder();

            for (char ch : chars) {
                if (isVowel(ch)) {
                    vowels.append(ch);
                } else if (Character.isLetter(ch)) {
                    consonants.append(ch);
                }
            }

            // Printing formatted output
            System.out.println(word + ":");
            System.out.println(consonants + "-" + consonants.length());
            System.out.println(vowels + "-" + vowels.length());
            System.out.println(); // Line break for readability
        }
    }

    // Function to check if a character is a vowel
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return "aeiou".indexOf(ch) != -1;
    }
}
