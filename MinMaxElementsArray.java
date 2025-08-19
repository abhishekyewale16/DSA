public class MinMaxElementsArray {
    public static void main(String[] args) {
        int a[]={50,60,25,46,47,1};
        int max=a[0];

        for(int i=1; i<a.length; i++){
            if(a[i] > max){  // Change < to >
                max=a[i];
            }
        }
        System.out.println("The Maximum Number in Array is:" +max); 
    }
}
