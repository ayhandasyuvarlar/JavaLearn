import java.util.Scanner;

public class KullanıcıGirişi {
    public static void main(String[] args) {
        String username, password, newPassword, choose;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz ");
        username = input.nextLine();
        System.out.print("Şifrenizi girinizi: ");
        password = input.nextLine();

        if (username.equals("ayhan") && password.equals("123456789")) {
            System.out.print("Giriş başarılı , yonlendiriliyorsubuz");
        } else {
            System.out.println("Kullanıcı adınız veya sıfreniz hatalı");
            System.out.print("Şifrenizi yenilemek istermisiniz [Y/N]: ");
            choose = input.nextLine();
            switch (choose) {
                case "Y":
                    System.out.print("Yeni şifre girinizi: ");
                    newPassword = input.nextLine();
                    if (newPassword.equals(password)) {
                        System.out.print("Şifreniz bir önceki şifreniz ile aynı olamaz. yeniden inşa et.");
                    } else {
                        System.out.print("Şifreniz değiştirildi.");
                    }
                case "N":
                    System.out.print("Hesabınıza tekrar giriş yapmayı deneyin.");
            }

        }
    }
}