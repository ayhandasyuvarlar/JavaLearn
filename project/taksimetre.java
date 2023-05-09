import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        int acilisucreti = 10;
        double kmbasiucret = 2.20;
        int mintutar = 20;
        double toplamtutar;
        double km;
        Scanner inp = new Scanner(System.in);
        System.out.println("kac km gıttınız");
        km = inp.nextDouble();

        toplamtutar = (km * kmbasiucret) + acilisucreti;

        if (toplamtutar < 20) {
            System.out.println("Odemeniz gereken toplam tutar : " + mintutar + " TL ");
        } else {
            System.out.println("Odemeniz gereken toplam tutar : " + toplamtutar + " TL ");
        }

    }
}
