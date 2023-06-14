public class Palindrome {
    public static void main(String[] args) {
        checkPalindrome("house");
        checkPalindrome(454);
    }

    public static void checkPalindrome(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);

        System.out.println(string + " is"
                + (!string.equals(stringBuilder.reverse().toString()) ? " not" : "") + " a Palindrome");
    }

    public static void checkPalindrome(int number) {
        checkPalindrome(String.valueOf(number));
    }
}
