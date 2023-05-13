import java.util.Scanner;

public class harmonicNumbers {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        int number;
        double out = 0;

        System.out.print("Enter a number for Harmonic numbers: ");
        number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            out += (1.0 / i);
        }
        System.out.println(out);

    }
}