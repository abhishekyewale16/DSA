public class reversestring {
    
    public static void main(String[] args) {
        
        // 1)  Using +(String Concatation) Opeartor

        String str="Abhishek";
        String rev="";

        /*int len=str.length();

        for (int i =len-1; i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("Revrsed String is :"+rev);
        */

        //2. Using Character Array
        /* 
        char a[]=str.toCharArray();   
        for (int i = a.length-1; i>=0; i--)
        {
            rev=rev+a[i];
        }
        System.out.println("Revrsed String is :"+rev);
        */

        // 3. Using String Buffer Class

        StringBuffer sb= new StringBuffer(str);
        System.out.println(sb.reverse());

    }
}
