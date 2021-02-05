import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //Simple calculator
        //Enter your numbers and the system will do the math for you!

        //Scanner for input - Tobias
        System.out.println("Give the first number:");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println("");

        System.out.println("The Result");
        System.out.println(+num1+ " * " +num2+ " = " + (multi(num1,num2)));

        int input1 = 3;
        int input2 = 5;
        int numberToSubtractFrom = 75;
        int numberToSubtract = 50;

        int result1 = addition(input1, input2);
        int result = subtract(numberToSubtract, numberToSubtractFrom);
        System.out.println(input1 + " + " + input2 + " = " + result1);
        System.out.println("This is the result: " + result);

        }

        //Method for multiplication -Tobias
        public static int multi(int num1, int num2) {
        return num1 * num2;
        }

        public static int subtract(int numToSub, int numFrom) {
        return numFrom-numToSub;
        }

        public static int addition(int a, int b) {
        return (a+b);
    }
}

