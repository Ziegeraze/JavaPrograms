public class NeonNumber {
    public static void main(String[] args) {
        System.out.println(isNeonNumber(8));
    }

    static boolean isNeonNumber(int number) {
        int square = (int) Math.pow(number, 2);
        int[] digits = Integer.toString(square).chars().map(c -> c - '0').toArray();
        int sum = 0;

        for (int d : digits)
            sum += d;

        return number == sum;
    }
}
