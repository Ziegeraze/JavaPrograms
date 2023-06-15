public class ArmstrongNumber {

    /* An Armstrong number is a positive m-digit number
       that is equal to the sum of the mth powers of their digits.
       It is also known as pluperfect, or Plus Perfect, or Narcissistic number.
     */
    public static void main(String[] args) {
        checkArmstrong(8208);
        checkArmstrong(8209);
        checkArmstrong(9474);
        checkArmstrong(9475);
        checkArmstrong(9800817);
        checkArmstrong(9800818);
    }

    static void checkArmstrong(int number) {
        char[] charArray = String.valueOf(number).toCharArray();

        int sum = 0;

        for (char c : charArray) {
            sum += Math.pow(Character.getNumericValue(c), charArray.length);
        }

        System.out.println(number + " is"
                + (number == sum ? "" : " not")
                + " an Armstrong number");
    }
}
