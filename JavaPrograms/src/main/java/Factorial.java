public class Factorial {
    static int ans = 1, aux;

    public static void main(String[] args) {
        System.out.println(checkFactorial(5));
        checkFactorialRecursive(4);
    }

    static int checkFactorial(int n) {
        int ans = 1;
        while (n > 0) {
            ans *= n--;
        }

        return ans;
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
