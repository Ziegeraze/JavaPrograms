public class TechNumber {
    public static void main(String[] args) {
        System.out.println(isTechNumber(2025));
    }

    static boolean isTechNumber(int number) {
        int length = (int) (Math.log10(number) + 1);
        int digit, firstPart = 0, secondPart = 0, aux = number;

        if (length % 2 != 0)
            return false;

        for (int i = 0; i < length; i++) {
            digit = aux % 10;
            if (i < length / 2) {
                firstPart = (int) (firstPart + digit * (Math.pow(10, i)));
            } else {
                secondPart = (int) (secondPart + digit * (Math.pow(10, i - (int) (length / 2))));
            }
            aux /= 10;
        }

        return number == Math.pow(firstPart + secondPart, 2);
    }
}
