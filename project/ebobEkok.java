import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        int a = n1, b = n2, Ebob = 1, Ekok, k = 2;

        while ((a % k == 0) && (b % k == 0)) {
            a = a / k;
            b = b / k;
            Ebob *= k;
            if ((a % k != 0) || (b % k != 0)) {
                k++;
            }

        }
        Ekok = (n1 * n2) / Ebob;
        System.out.println("Ebob: " + Ebob);
        System.out.print("Ekok: " + Ekok);
    }
}