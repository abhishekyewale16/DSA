import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int count = 0;

        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.println(num + " is a Prime Number.");
            } else {
                System.out.println(num + " is Not a Prime Number.");
            }
        } else {
            System.out.println(num + " is Not a Prime Number.");
        }

        sc.close();
    }
}