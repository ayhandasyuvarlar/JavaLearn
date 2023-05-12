public class continueandbreak {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);

        }
        for (int k = 0; k < 9; k++) {
            System.out.print("*");
            if (k == 3)
                break;
        }
        int i = 0;
        for (i = 1; i <= 6; i++) {
            if (i % 3 == 0)
                continue;
            System.out.print(i + ",");
        }

    }
}
