package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * Test.java
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(swapHalves("Hello, world!"));
    }

    public static String swapHalves(String myString) {
        String firstHalf = myString.toLowerCase().substring(0, myString.length()/2);
        String secondHalf = myString.toUpperCase().substring(myString.length()/2);

        return  secondHalf + firstHalf;

    }
}

