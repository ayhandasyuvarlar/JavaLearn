import java.util.Scanner;

public class findingaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle segment :");
        double r = sc.nextDouble();

        System.out.print("Enter the measure of the central angle of the circle segment: ");
        double alpha = sc.nextDouble();

        double pi = 3.14;
        double area = (pi * (r * r) * alpha) / 360;

        System.out.println("Daire diliminin alanı : " + area);
    }
}