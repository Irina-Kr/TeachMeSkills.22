//The first Java lesson

import java.util.Arrays;


public class FormatLine {
    public static void main(String[] args) {

        String input = "2534-hfU-8769-Vue-8m2Y";
        String[] blocks = input.split("-");
        System.out.println(Arrays.toString(blocks));
        System.out.println("[" + blocks[0] + "]" + "[" + blocks[2] + "]");
        blocks[1] = "***";
        blocks[3] = "***";
        String modifiedLine = blocks[0] + "]-[" + blocks[1] + "]-[" + blocks[2]
                + "]-[" + blocks[3] + "]-[" + blocks[4];
        System.out.println("[" + modifiedLine + "]");


        String letters = ifLetters(input);
        String extractedLetters = extractLetters(letters);
        System.out.println(extractedLetters);
          String upperCaseLetters = formatLettersUpperCase(letters);
         System.out.println("Letters :" + upperCaseLetters + " ");
    }

    public static String ifLetters(String blocks) {
        StringBuilder subBlock = new StringBuilder();

        for (char c : blocks.toCharArray()) {
            if (Character.isLetter(c)) {
                subBlock.append(c);
            }
        }
        return subBlock.toString();
    }

    public static String extractLetters(String letters) {
        StringBuilder lettersBuilder = new StringBuilder();

        for (int i = 0; i < letters.length(); i++) {
            char c = Character.toLowerCase(letters.charAt(i));
            lettersBuilder.append(c);
            if (i == 2) {
                lettersBuilder.append('/');

            } else {

                i++;
            }
        }
        return lettersBuilder.toString();

    }

    public static String formatLettersUpperCase(String letters) {
        StringBuilder formattedBuilder = new StringBuilder();
        int lettersGroupCountLimit = 3;
        int currentLetterCount = 1;
        for (int i = 0; i < letters.length(); i++) {
            char c = Character.toUpperCase(letters.charAt(i));
            formattedBuilder.append(c);
            if (currentLetterCount == lettersGroupCountLimit) {
                formattedBuilder.append('/');
                currentLetterCount = 1;
            } else {
                currentLetterCount++;
            }
        }
        return formattedBuilder.toString();
    }
}


