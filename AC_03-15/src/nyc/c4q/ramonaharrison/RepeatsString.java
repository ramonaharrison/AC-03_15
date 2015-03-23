package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * RepeatsString.java
 */
public class RepeatsString {

    public static void main(String[] args) {

        System.out.println(repeatedString("abc", 10));
        // "abcabcabca"


    }

    public static String repeatedString(String input, int length) {
        String result = "";
        for (int i = 0; result.length() < length; i++) {
            int iMod3 = i % 3;
            result = result + input.charAt(iMod3);
        }

        return result;
    }
}
