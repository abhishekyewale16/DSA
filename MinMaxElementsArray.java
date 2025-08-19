public class MinMaxElementsArray {

    public static void main(String[] args) {
        
        int a[]={50,60,25,46,47,1};
        int max=a[0];
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("The Maximum Number in Array is:"+max);

        for(int i=1; i<a.length; i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("The Minimum Number in Array is:"+min);
    
    }
}