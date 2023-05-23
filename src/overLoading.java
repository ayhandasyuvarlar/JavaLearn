public class overLoading {
    static void print() {
        System.out.println("Hello world");
    }

    static void print(int a) {
        System.out.println("parameter :" + a);
    }

    public static void main(String[] args) {
        print(5);
        print();
    }
}
