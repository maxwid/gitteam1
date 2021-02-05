import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Simple calculator
        System.out.println("Give the first number:");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println("");

        System.out.println("The Result");
        System.out.println(+num1+ " * " +num2+ " = " + (multi(num1,num2)));

        multi(num1, num2);
        subtract(num1, num2);
        addition(num1, num2);

        }

        public static int multi(int num1, int num2) {
        return num1 * num2;
        }

        public static int subtract(int numToSub, int numFrom) {
        return numFrom-numToSub;
        }

        public static void addition(int a, int b) {


    }
}

