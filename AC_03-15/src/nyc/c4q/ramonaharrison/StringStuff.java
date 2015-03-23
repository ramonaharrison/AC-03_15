package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * StringStuff.java
 */

public class StringStuff {

    /**
     * @param input
     *   The string to reverse.
     * @return
     *   A new string constructed by reversing `input`.
     */
    public static String reverse(String input) {
        int numChars = input.length();
        String result = "";
        for (int i = numChars - 1; i >= 0; i--) {
            result += input.charAt(i);
        }
        return result;
    }

    /**
     * Prints a string reversed, i.e. back to front.
     */
    public static void printReverse(String input) {
        System.out.println(reverse(input));
    }

    public static String repeat(char c, int count) {
        String result = "";
        for (int i = 0; i < count; ++i) {
            result += c;
        }
        return result;
    }

    public static void underline(String text, char underlineChar) {
        System.out.println(text);
        String underline = repeat(underlineChar, text.length());
        System.out.println(underline);
    }

    public static void printBoxTop(String text) {
        System.out.println("+" + repeat('-', text.length() + 2) + "+");
    }

    public static void printInBox(String text) {
        printBoxTop(text);
        System.out.println("| " + text + " |");
        printBoxTop(text);
    }

    public static String pad(String text, int length, char padChar) { // pads on right
        return pad(text, length, padChar, false);
    }

    public static String pad(String text, int length, char padChar, boolean left) {
        String padding = repeat(padChar, length - text.length());
        if (left)
            return padding + text;
        else
            return text + padding;
    }


    public static String substring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static String substring(String text, int start) {
        return substring(text, start, text.length());
    }

    public static void main(String[] args) {

        System.out.println(swapHalves("Hello, World!"));

    }

    public static String swapHalves(String input) {
        String firstHalf = substring(input, 0, input.length()/2);
        String secondHalf = substring(input, input.length()/2);

        return  secondHalf + firstHalf;
    }



}
