import java.util.Scanner;

public class countnumberdigits  {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int num2 = 0;  // Initialize counter

        while (num > 0) {
            num = num / 10;
            num2++;    
        }

        System.out.println("Count of Number = " + num2);  // Print the result
    }
}