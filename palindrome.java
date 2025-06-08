import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:");

        int num = sc.nextInt();
        int num2 = num;
        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        
        if (num2 == rev) {
            System.out.println("The Given Number is Palindrome");
        } else {
            System.out.println("The Given number is not a Palindrome"); 
            sc.close();
        }
    }
}