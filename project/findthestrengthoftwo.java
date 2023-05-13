public class findthestrengthoftwo {
    public static void main(String[] args) {
        int n, i;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();
        System.out.println("Powers of 4 up to the entered number:");
        for (i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }
        System.out.println("----------------------------");
        System.out.println("Power of 5 up to the entered number:");

        for (i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }

    }
}
