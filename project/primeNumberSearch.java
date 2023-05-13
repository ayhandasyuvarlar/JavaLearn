import java.util.Scanner;

public class primeNumberSearch {
    public static void main(String[] args) {
        int w ;
        int total = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        w = sc.nextInt();

        for (int z = 1 ; z<=w ; z+=2){
            if(z%2 == 1);
            System.out.println(z);
            total += z;
        }

        System.out.print("Total = " + total);

    }
}
