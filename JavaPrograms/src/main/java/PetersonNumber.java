public class PetersonNumber {
    public static void main(String[] args) {
        petersonNumber(146);
    }

    static void petersonNumber(int number) {
        int aux = number;
        int sum = 0;

        while(aux > 0) {
            sum += Factorial.checkFactorial(aux % 10);
            aux /= 10;
        }

        System.out.println(number + " is a Peterson Number: " + (sum == number));
    }
}
