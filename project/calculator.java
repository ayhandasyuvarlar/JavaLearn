public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Process:\n" +
                "*\n" +
                "+\n" +
                "-\n" +
                "%\n");
        double number1, number2;
        string process;
        System.out.print("Please write the logo of the transaction you want to do: ");
        process = input.nextLine();
        System.out.print("first number enter value  :");
        number1 = input.nextDouble();
        System.out.print("second number enter value : ");
        number2 = input.nextDouble();

        switch (process) {
            case "*":
                System.out.println("Result of  count : " + (number1 * number2));
                break;
            case "+":
                System.out.println("multiplication out: " + (number1 * number2));
                break;
            case "-":
                System.out.println("Result of subtraction: " + (number1 - number2));
                break;
            case "%":
                System.out.println("Result of divide: " + (number1 % number2));
                break;
            default:
                System.out.println("404 error");
        }
    }
}
