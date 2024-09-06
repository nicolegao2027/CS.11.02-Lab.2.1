/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int sum = add(3, 8);
        System.out.println(sum);

        int sumfour = add(3, 8, 4, 9);
        System.out.println(sumfour);

        String morningGreet = morningGreeting("Toby Fox");
        System.out.println(morningGreet);

        String afternoonGreet = afternoonGreeting("Mac Miller");
        System.out.println(afternoonGreet);

        String tripledString = triple("oohbaby");
        System.out.println(tripledString);

        double halfValue = half(8);
        System.out.println(halfValue);

        int roundedPositive = roundPositiveValueToNearestInteger(8.5);
        System.out.println(roundedPositive);

        int roundedNegative = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(roundedNegative);
    }

    // 1. add
    public static int add(int a,int b){
        return a+b;
    }
    // 2. add
    public static int add(int a, int b, int c,int d){
        return add(a,b)+add(c,d);
    }
    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }
    // 5. triple
    public static String triple(String input) {
        return input + input + input;
    }
    // 6. half
    public static double half(double value) {
        return value / 2.0;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double positiveValue) {
        int rounded;
        if (positiveValue % 1 < 0.5) {
            rounded = (int) positiveValue;
        } else {
            rounded = (int) positiveValue + 1;
        }
        return rounded;
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double negativeValue) {
        int rounded;
        if (negativeValue % 1 > -0.5) {
            rounded = (int) negativeValue;
        } else {
            rounded = (int) negativeValue - 1;
        }
        return rounded;
    }
}
