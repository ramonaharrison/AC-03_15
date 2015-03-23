package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * countsCharacters.java
 */
public class countsCharacters {
    public static void main(String[] args) {
        System.out.println(countChars("Hello, world!", 'l'));


    }

    public static int countChars(String string, char letter) {
        int total = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == letter) {
                total += 1;
            }
        }

        return total;
    }
}
