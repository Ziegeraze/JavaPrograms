public class Factorial {
    static int ans = 1, aux;

    public static void main(String[] args) {
        checkFactorial(5);
        checkFactorialRecursive(4);
    }

    static void checkFactorial(int n) {
        int ans = 1;
        while (n > 0) {
            ans *= n--;
        }
        System.out.println(ans);
    }

    static void checkFactorialRecursive(int n) {
        aux = n;
        if (aux > 0) {
            ans *= aux;
            checkFactorialRecursive(--aux);
        } else {
            System.out.println(ans);
        }
    }
}
