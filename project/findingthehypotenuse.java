import java.util.Scanner;

public class findingthehypotenuse {
    public static void main(String[] args) {
        int a, b;
        double c;
        Scanner inp = new Scanner(System.in);
        System.out.println("length of side A");
        a = inp.nextInt();
        System.out.println("length of side B");
        b = inp.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println(c);
    }
}
