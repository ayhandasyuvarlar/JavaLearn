import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        int k;
        int i = 1;
        System.out.println();
        while (i <= 4) {
            k = 1;
            System.out.println(i);
            while (k <= 10) {
                System.out.print(k + ",");
                k++;
            }
            System.out.println();
            i++;
        }
    }

    public static void looptwo(String[] args) {
        int left = 100, right = 200;

        while (++left < --right)
            ;

        System.out.println(left);
    }

    public static void whilloop(String[] args) {
        int password;
        Boolean isPasswordSucess = true;
        Scanner sc = new Scanner(System.in);

        while (isPasswordSucess) {
            System.out.println("sifrenizi giriniz");
            password = sc.nextInt();
            if (password == 123) {
                System.out.println("Giris basarili");
                isPasswordSucess = false;
            }else{
                System.out.println("hatali giris");
            }
            
        }
    }
}
