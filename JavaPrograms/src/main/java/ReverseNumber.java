public class ReverseNumber {
    public static void main(String[] args) {
        reverseNumberWhile(1234);
        reverseNumberFor(1234);
        reverseNumberRecursive(1234);
    }

    static void reverseNumberWhile(int number) {
        int reverse = 0;
        int reminder;
        while (number > 0) {
            reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number /= 10;
        }
        System.out.println(reverse);
    }

    static void reverseNumberFor(int number) {
        int reverse = 0;
        int reminder;
        for (; number > 0; number /= 10) {
            reminder = number % 10;
            reverse = reverse * 10 + reminder;
        }
        System.out.println(reverse);
    }

    static void reverseNumberRecursive(int number) {
        if(number>0) {
            System.out.print(number % 10);
            reverseNumberRecursive(number/10);
        }
    }
}
