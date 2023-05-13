import java.util.Scanner;

public class taximeter {
    public static void main(String[] args) {
        int startPrice = 10;
        double kmbasisfee = 2.20;
        int minTotal = 20;
        double totalAmount;
        double km;
        Scanner inp = new Scanner(System.in);
        System.out.println("how many miles have you traveled");
        km = inp.nextDouble();

        totalAmount = (km * kmbasisfee) + startPrice;

        if (totalAmount < 20) {
            System.out.println("Total amount you have to pay : " + minTotal + " TL ");
        } else {
            System.out.println("Total amount you have to pay : " + totalAmount + " TL ");
        }

    }
}
