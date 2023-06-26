public class SunnyNumber {
    public static void main(String[] args) {
        System.out.println(sunnyNumber(3));

    }

    static boolean sunnyNumber(int number) {
        double sqrt = Math.sqrt(number + 1);

        return sqrt - (int) sqrt == 0.0;
    }
}
