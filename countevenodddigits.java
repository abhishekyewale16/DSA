import java.util.Scanner;
public class countevenodddigits {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number: ");
            int num = sc.nextInt();
        
            int even_count = 0;
            int odd_count = 0;
        
            while (num > 0) 
            {
            int rem = num % 10;
        
            if(rem % 2 == 0)
            {
                even_count++;
            }
            else
            {
                odd_count++;
            }
        
            num = num / 10;
            
            }
        
            System.out.println("Even number in Given Number: " + even_count);
            System.out.println("Odd Number in Given Number: " + odd_count);
        }


    }
    
}
