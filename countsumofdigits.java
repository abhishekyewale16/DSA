import java.util.Scanner;

public class countsumofdigits {

    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter a Number:");
            int num=sc.nextInt();
            int sum=0;
            int originalNum = num;  
            while (num > 0) {
                sum += num % 10;  
                num = num / 10;   
            }  
            System.out.println("The Sum of the digits in " + originalNum + " is: " + sum);
            sc.close();         
        }
    }
}
