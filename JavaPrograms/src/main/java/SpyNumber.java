public class SpyNumber {
    public static void main(String[] args) {
        //System.out.println(isSpyNumber(133));
        getSpyNumbers();
    }

    static void getSpyNumbers() {
        for (int i = 1; i <= 1000; i++) {
            if (isSpyNumber(i))
                System.out.println(i);
        }
    }

    static boolean isSpyNumber(int number) {
        int sum = 0;
        int prod = 1;

        int[] digits = Integer.toString(number).chars().map(c -> c - '0').toArray();

        for (int d : digits) {
            sum += d;
            prod *= d;
        }

        return sum == prod;
    }
}
