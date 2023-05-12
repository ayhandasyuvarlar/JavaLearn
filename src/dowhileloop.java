import java.util.Scanner;

public class dowhileloop {
    public static void main(String[] args) {
        int password;
        Boolean isPasswordSucess = true;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("sifrenizi giriniz");
            password = sc.nextInt();
            if (password == 123) {
                System.out.println("Giris basarili");
                isPasswordSucess = false;
            } else {
                System.out.println("hatali giris");
            }

        } while (isPasswordSucess);
    }
}
