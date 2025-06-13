import java.util.*;
public class reversenumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number:");
            int num=sc.nextInt(); //1234
            
            // 1.Using  Algorithms
            /*
            int rev=0;
            while (num !=0)
            {
            rev=rev*10+num%10;  //0+1234%10=4  40+3=43    430+2=432   4320+1=4321
            num=num/10;  //1234/10=123         123/10=12   12/10=1     1/10=0
            
            }
            */
            // 2. Using Strinbuffer Class
            /*
            StringBuffer sb =new StringBuffer(String.valueOf(num));
            StringBuffer rev=sb.reverse();
            */
            
            // 3. Using Stringbulider Class
            
            StringBuilder sbl =new StringBuilder();
            sbl.append(num);
            
            StringBuilder rev=sbl.reverse();
            
            System.out.println("Reverse Number is :" +rev);
        }


    }
}
