public class KeithNumber {
    public static void main(String[] args) {
        //System.out.println(isKeithNumber(251133297));
        getKeithNumbers();
    }

    static void getKeithNumbers() {
        for (int i = 1; i <= 7909; i++) {
            if (isKeithNumber(i))
                System.out.println(i);
        }
    }

    static boolean isKeithNumber(int number) {
        int[] digits = Integer.toString(number).chars().map(c -> c - '0').toArray();
        int sum = 0;

        while (sum < number) {
            sum = 0;
            for (int i = 0; i < digits.length; i++) {
                sum += digits[i];
                if (i > 0) {
                    digits[i - 1] = digits[i];
                }
            }
            digits[digits.length - 1] = sum;
        }

        return sum == number;
    }
}
