import java.util.Scanner;

public class factorialcalculation {
    public static void main(String[] args) {
        int num, total = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number enter value");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            total = total * i ;
        }
        System.out.println(total);
    }
}
