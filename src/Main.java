public class Main {

    public static void main(String[] args) {
        int input1 = 3;
        int input2 = 5;
        int numberToSubtractFrom = 75;
        int numberToSubtract = 50;

        int result1 = addition(input1,input2);
        int result = subtract(numberToSubtract, numberToSubtractFrom);
        System.out.println(input1 + " + " + input2 + " = " + result1);
        System.out.println("This is the result: " + result);
    }

    public static int subtract(int numToSub, int numFrom) {
        return numFrom-numToSub;


    }

    public static int addition(int a, int b) {
        return (a+b);
    }
}
