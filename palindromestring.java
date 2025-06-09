import java.util.Scanner;

public class palindromestring {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your String");
        String str=sc.next();

        String str2=str;

        String rev="";

        int len=str.length();
        for (int i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }

        if (str2.equals(rev)) {
            System.out.println(str+ "The Given String is Palindrome");
        }
        else
        {
            System.out.println(str+ "The Given String is Not Palindrome");
        }

    }
    
}
