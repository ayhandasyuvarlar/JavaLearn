import java.utl.Scanner;

public class kdv {
    public static void main(String[] args) {
        double total, kdvValue = 0.18, kdvdiscount = 0.8;
        double kdvPrice;
        double kdvTotal;
        Scanner input = new Scanner(System.in);
        System.out.println("How much is the total amount you have paid");
        total = input.nextDouble();

        String discount = total > 1000 ? "to apply" : "not to apply";

        if (discount == "to apply") {
            kdvTotal = total * kdvdiscount;
            kdvPrice = total + kdvTotal;
            System.out.println("Price with KDV : " + kdvPrice);
            System.out.println("KDV Amount : " + kdvdiscount);
        } else {
            kdvTotal = total * kdvValue;
            kdvPrice = total + kdvTotal;
            System.out.println("Price with KDV : " + kdvPrice);
            System.out.println("KDV Amount : " + kdvValue);
        }

    }
}
