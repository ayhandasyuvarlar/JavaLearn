import java.util.Scanner;
public class fibonacci {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        int n1=0,n2=1;
        System.out.print("enter a number: ");
        int num =input.nextInt();
        System.out.print(num+" number is fibonnacci values: ");
        for (int i=1;i<=num;i++){
            System.out.print(n1+"  ");
            int total= n1+n2;
                n1=n2;
                n2=total;
        }
    }
}