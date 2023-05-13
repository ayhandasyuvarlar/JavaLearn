import java.util.Scanner;

public class ExponentCalculator {
    public static void main(String[] args) {
        int n, k, t = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number enter value");
        n = sc.nextInt();
        System.out.println("Exponent Number enter value");
        k = sc.nextInt();

        for (int i = 1; i <= k; i++) {
            t *= n;
        }
        System.out.println(t);
    }
}
