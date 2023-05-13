import java.util.Scanner;

public class activityAdvice {
    public static void main(String[] Args) {

        int heat;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter air temperature: ");
        heat = sc.nextInt();

        if (heat <= -10) {
            System.out.println("You can watch on Netflix at home.");
        } else if (heat <= 25) {
            if (heat <= 3) {
                System.out.println("You can go to skiing.");
            }

            if (heat > 0) {
                System.out.println("you can go to cinema.");
            }
            if (heat > 10) {
                System.out.println("You can go to picnic");
            }

        } else {
            System.out.println("You can go swimming.");
        }

    }
}