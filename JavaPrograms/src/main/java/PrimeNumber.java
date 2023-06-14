public class PrimeNumber {
    public static void main(String[] args) {
        checkPrime(2);
        checkPrime(6);
        checkPrime(7);
    }

    public static void checkPrime(int n) {
        boolean isPrime = true;

        if (n == 0 || n == 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(n + " is" + (!isPrime ? " not" : "") + " a prime number");
    }
}
