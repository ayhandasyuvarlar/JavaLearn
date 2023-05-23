public class ReturnandVoid {
    static void sum(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    static int sumTwo(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        sum(60, 5);
        System.out.println(sumTwo(6, 5));
    }
}
