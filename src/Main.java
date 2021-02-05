import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Simple calculator
        // Enter the first
        System.out.println("Give the first number:");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println("");

        System.out.println("The Result");
        System.out.println(+num1+ " * " +num2+ " = " + (multi(num1,num2)));
        System.out.println(+num1+ " / " +num2+ " = " + (1.0*div(num1,num2)));

        }
        //Method for
        public static int multi (int num1, int num2) {
            return num1*num2;
        }

        public static int div (int num1, int num2) {
        return num1/num2;
    }
}