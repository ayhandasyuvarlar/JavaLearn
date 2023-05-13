import java.util.Scanner;

public class couple {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number enter value");
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }
    }
}
