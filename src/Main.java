public class Main {

    public static void main(String[] args) {
        int numberToSubtractFrom = 75;
        int numberToSubtract = 50;

        int result = subtract(numberToSubtract, numberToSubtractFrom);

        System.out.println("This is the result: " + result);
    }

    public static int subtract(int numToSub, int numFrom) {
        return numFrom-numToSub;
    }
}
