package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * CaesarCipher.java
 * A Caesar Cipher using string arrays and user specified offsets
 *
 */

import java.util.Scanner;

public class CaesarCipher {

    public static String encode(String input, int offset) {

        String[] alpha = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz".split("");
        String[] splitInput = input.split("");
        String message = "";

        for (int i = 0; i < splitInput.length; i++){            // for each letter in the message
            for (int j = 26; j < 53; j++) {                     // compare to each letter in the alphabet
                if (splitInput[i].equals(" ")) {
                    message += " ";                             // preserves spaces in the message
                    break;
                } else if (splitInput[i].equalsIgnoreCase(alpha[j])) {  // adds the offset letter to the return string
                    message += alpha[j + offset];
                }
            }
        }

        return message;
    }
    public static String decode(String input, int offset) {     // decode simply encodes with a negative offset
        return encode(input, 0 - offset);
    }

    public static boolean codeBreaker(String message1, String message2) {

        for (int i = 0; i < 26; i++) {                          //
            if (message1.equalsIgnoreCase(encode(message2, i))) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Caesar Cipher   ||   Jrypbzr gb gur Pnnrfnne Pvcure\n\n");
        Scanner sc = new Scanner(System.in);

        System.out.println("Would you like to encode, decode, or codebreak?");

        while (true) {

            String task = sc.nextLine();

            if (task.equalsIgnoreCase("encode")) {

                int offset = -1;
                String toEncode;
                System.out.println("Enter the message you'd like to encode:");
                toEncode = sc.nextLine();

                while (offset < 0 || offset > 26) {
                    System.out.println("Please choose an offset between 0 and 26:");
                    offset = sc.nextInt();
                }

                System.out.println("Here is your ~SUPER SECRET~ encoded message:\n\n     " + encode(toEncode, offset));


            } else if (task.equalsIgnoreCase("decode")) {

                int offset = -1;
                String toDecode;
                System.out.println("Enter the message you'd like to decode:");
                toDecode = sc.nextLine();

                while (offset < 0 || offset > 26) {
                    System.out.println("Please choose an offset between 0 and 26:");
                    offset = sc.nextInt();
                }

                System.out.println("Here is your decoded message:\n\n     " + decode(toDecode, offset));


            } else if (task.equalsIgnoreCase("codebreak")) {

                System.out.println("Enter the first message you'd like to compare:");
                String firstMessage = sc.nextLine();
                System.out.println("Enter the second message you'd like to compare:");
                String secondMessage = sc.nextLine();

                boolean match = codeBreaker(firstMessage, secondMessage);

                if (match) {
                    System.out.println("It's a match!");
                } else {
                    System.out.println("No match.");
                }

            } else {
                System.out.println("\nEncode, decode, or codebreak?");
            }

        }

    }

}
