import java.util.Scanner;

public class weightHeightIndex {
    public static void main(String[] args) {
        double height, weight, index;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your height (in metres): ");
        height = input.nextDouble();

        System.out.print("Please enter your weight: ");
        weight = input.nextDouble();

        index = weight / (height * height);
        System.out.println("Your Body Mass Index: " + index);
    }

}