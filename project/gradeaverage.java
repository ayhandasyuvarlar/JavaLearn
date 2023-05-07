import java.util.Scanner;

public class gradeaverage {

    public static void main(String[] args) {
        int mac, physical, chemical, turkish, date, musical;
        Scanner inp = new Scanner(System.in);

        System.out.print("Mac your note: ");
        mac = inp.nextInt();

        System.out.print("Physical your note: ");
        physical = inp.nextInt();

        System.out.print("Chemical your note :");
        chemical = inp.nextInt();

        System.out.print("Turkish your note: ");
        turkish = inp.nextInt();

        System.out.print("Date your note: ");
        date = inp.nextInt();

        System.out.print(" Musical your note: ");
        musical = inp.nextInt();

        int count = (mac + physical + chemical + turkish + date + musical);
        double finish = count / 6.0;
        System.out.println("Average: " + finish);

        boolean situation = sonuc >= 60;
        System.out.println(situation ? "Passed the Class" : "Didn't pass the class");

    }
}
