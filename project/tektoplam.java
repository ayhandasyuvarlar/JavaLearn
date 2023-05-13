import java.util.Scanner;

public class tektoplam {
    public static void main(String[] args) {
        int num;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir numara giriniz");
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            if (i % 2 != 0) {
                total += i;
            }
        }
        System.out.println(total);
    }
}
