import java.util.Scanner;

public class smalltolargesort {
    public static void main(String[] args) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.print("First number a enter ");
        x = sc.nextInt();
        System.out.print("Second number a enter ");
        y = sc.nextInt();
        System.out.print("Third number a enter  ");
        z = sc.nextInt();
        if (x > y && x > z && y > z) {
            System.out.println(x + ">" + y + ">" + z);
        } else if (x > y && x > z && z > y) {
            System.out.println(x + ">" + z + ">" + y);
        } else if (y > x && y > z && x > z) {
            System.out.println(y + ">" + x + ">" + z);
        } else if (y > x && y > z && z > x) {
            System.out.println(y + ">" + z + ">" + x);
        } else if (z > x && z > y && x > y) {
            System.out.println(z + ">" + x + ">" + y);
        } else {
            System.out.println(z + ">" + y + ">" + x);
        }
    }
}