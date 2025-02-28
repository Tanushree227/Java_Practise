import java.util.Scanner;

public class StringCharArray {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        scanner.close();

        String[] words = input.split("\\s+");

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

            System.out.println(word + ":");
            System.out.println(consonants + "-" + consonants.length());
            System.out.println(vowels + "-" + vowels.length());
            System.out.println();
        }
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return "aeiou".indexOf(ch) != -1;
    }
}
