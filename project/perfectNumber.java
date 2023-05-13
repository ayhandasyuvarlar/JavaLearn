import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, total = 0;

        System.out.print("Enter a number");
        n = input.nextInt();


        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                total = total + i;
            }
        }
        if (n == total) {

            System.out.println(n + " Perfect a number.");
        } else {
            System.out.println(n +  " Dont perfect a number.");

        }


    }
