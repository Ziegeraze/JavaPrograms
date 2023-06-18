public class AutoMorphicNumber {
    public static void main(String[] args) {
        /*isAutoMorphicNumber(25);
        isAutoMorphicNumber(312);
        isAutoMorphicNumber(625);*/

        isAutoMorphicString(312);
    }

    static void isAutoMorphicNumber(int number) {
        int square = (int) Math.pow(number, 2);
        int lastDigits = 0;
        int numberDigits = 0;
        int aux = number;

        while (aux > 0) {
            aux /= 10;
            numberDigits++;
        }

        for (int i = 0; i < numberDigits; i++) {
            lastDigits += (int) square % 10 * Math.pow(10, i);
            square /= 10;
        }

        System.out.println("Number " + number + " is"
                + (number == lastDigits ? "" : " not")
                + " AutoMorphic");
    }

    static void isAutoMorphicString(int number) {
        String square = String.valueOf((int) Math.pow(number, 2));
        int squareLength = square.length();
        String numberString = String.valueOf(number);
        int numberLength = numberString.length();

        String lastDigits = square.substring(squareLength - numberLength, squareLength);

        System.out.println("Number " + number + " is"
                + (lastDigits.equals(numberString) ? "" : " not")
                + " AutoMorphic");

    }
}
