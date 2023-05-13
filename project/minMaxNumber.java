import java.util.Scanner;
import java.util.Arrays;
public class MinandMax {
    public static void main (String [] Args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("How many numbers will you enter ");
        int n= input.nextInt();
        int [] numbers = new int[n]; 

        for (int i=1; i<=n ; i++) 
        {
            System.out.println("Enter "+ i + ". number: ");
            numbers [i-1] = input.nextInt(); 
        }
        Arrays.sort(numbers); 

        System.out.println("Entered minimum number is: "+ numbers[0]);
        System.out.println("Entered maximum number is: "+ numbers[n-1]);
    }
}