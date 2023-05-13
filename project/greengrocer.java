import java.util.Scanner;
public class greengrocer {
    public static void main(String[] args) {
        double pearPrice = 2.14, applePrice = 3.67, tomatoPrice = 1.11, bananaPrice = 0.95, eggplantPrice = 5.00;
        double pearWeight, appleWeight, tomatoWeight, bananaWeight, eggplantWeight;

        Scanner input = new Scanner(System.in);
        System.out.print("Pear How many kilograms? : ");
        pearWeight = input.nextDouble();

        System.out.print("Apple How many kilograms? : ");
        appleWeight = input.nextDouble();

        System.out.print("Tomato How many kilograms? : ");
        tomatoWeight = input.nextDouble();

        System.out.print("Banana How many kilograms? : ");
        bananaWeight = input.nextDouble();

        System.out.print("Eggplant How many kilograms? : ");
        eggplantWeight = input.nextDouble();

        double totalAmount = (pearWeight * pearPrice) + (appleWeight * applePrice) + (tomatoWeight * tomatoPrice)
                + (bananaWeight * bananaPrice) + (eggplantWeight * eggplantPrice);

        System.out.println("Total Amount" + totalAmount);


    }

}