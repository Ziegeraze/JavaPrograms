public class FibonacciSeries {
    static int n1, n2 = 1, n3, count = 10;

    public static void main(String[] args) {
        System.out.print(n1 + " " + n2);//printing 0 and 1
        withOutRecursion();

        System.out.println();
        n1 = 0;
        n2 = 1;
        n3 = 0;
        System.out.print(n1 + " " + n2);//printing 0 and 1
        withRecursion(count - 2);//n-2 because 2 numbers are already printed
    }

    public static void withOutRecursion() {
        for (int i = 2; i < count; ++i) //loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public static void withRecursion(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            withRecursion(count - 1);
        }
    }
}