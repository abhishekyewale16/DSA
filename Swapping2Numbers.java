import java.util.Scanner;

public class Swapping2Numbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            System.out.println("Before Swapping: num1 = " + num1 + ", num2 = " + num2);
            int temp = num1;
            num1 = num2;
            num2 = temp;
            System.out.println("After Swapping: num1 = " + num1 + ", num2 = " + num2);
            // Logic 2 = Without using the Third Variable
            /*num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;*/
            // Logic 3 = Using * and / Without the Third Variable (Both values should be non-zero)
            /*num1 = num1 * num2;
            num2 = num1 / num2;
            num1 = num1 / num2;*/
            // Logic 4 = Using Bitwise Operator
            /*num1 = num1 ^ num2;
            num2 = num1 ^ num2;
            num1 = num1 ^ num2;*/
            // Logic 5 = Using Single Statement
            /*num2 = (num1 + num2) - (num1 = num2);*/
        }

    }
}
       