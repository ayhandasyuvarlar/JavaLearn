import java.util.Scanner;

public class cift {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir numara giriniz");
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }
    }
}
