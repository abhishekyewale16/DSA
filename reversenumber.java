import java.util.*;
public class reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");

        int num=sc.nextInt();

        // Using  Algorithms

        int rev=0;
        while (num !=0) 
        {
            rev=rev*10+num%10;
            num=num/10;
            
        }
        System.out.println("Enter a Revervse Number:" +rev);
        sc.close();

    }
}
