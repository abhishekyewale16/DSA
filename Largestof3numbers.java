import java.util.Scanner;

public class Largestof3numbers {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A  First Number:");
        int a =sc.nextInt();

        System.out.println("Enter A  Second Number:");
        int b =sc.nextInt();

        System.out.println("Enter A  Third Number:");
        int c =sc.nextInt();

        /* Approcah 1
        if(a>b && a>c)
        {
            System.out.println(a+ "is Largest Number");
        }
        else if(b>a && b>c)4
        {
            System.out.println(b+ "is Largest Number");
        }
        else
        {
            System.out.println(c + "is Largest Number");
        }
        */    
        
        //Using Ternary Operator 

        //int largest1= a>b ? a:b;

        //int Largest2=c>largest1 ? c:largest1;

        int Largest=c>(a>b ? a:b)? c:(a>b ? a:b);

        System.out.println(Largest+ "is The Largest Number");
        sc.close();
    }   
}