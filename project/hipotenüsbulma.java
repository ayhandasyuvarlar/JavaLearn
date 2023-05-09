import java.util.Scanner;

public class hipotenüsbulma {
    public static void main(String[] args) {
        int a, b;
        double c;
        Scanner inp = new Scanner(System.in);
        System.out.println("A kenarının uzunlugu");
        a = inp.nextInt();
        System.out.println("B kenarının uzunlugu");
        b = inp.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println(c);
    }
}
