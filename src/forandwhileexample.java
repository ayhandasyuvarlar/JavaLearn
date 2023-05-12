import java.util.Scanner;

public class forandwhileexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        for (boolean run = true; run;) {
            System.out.println("Enter number value");
            number = sc.nextInt();
            if (number < 0) {
                run = false;
            }
        }

        /* -------------------------------------------------------- */
        do {
            System.out.println("Enter number value");
            number = sc.nextInt();  
        }while(number < 0);

    }
}
