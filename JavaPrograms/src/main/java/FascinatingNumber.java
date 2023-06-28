import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FascinatingNumber {
    public static void main(String[] args) {
        // The Fascinating number from 1 to 10000 are:
        // 192 219 273 327 1902 1920 2019 2190 2703 2730 3027 3270
        System.out.println(isFascinatingNumberSet(2019));
    }

    static boolean isFascinatingNumber(int number) {
        int x2 = number * 2;
        int x3 = number * 3;

        String numberString = String.valueOf(number) + x2 + x3;
        numberString = numberString.replace("0", "");

        if (numberString.length() != 9)
            return false;

        for (int i = 1; i < 10; i++) {
            numberString = numberString.replace(String.valueOf(i), "");

            if (numberString.length() != 9 - i)
                return false;
        }

        return true;
    }

    static boolean isFascinatingNumberSet(int number) {
        int x2 = number * 2;
        int x3 = number * 3;

        SortedSet<Character> set =
                (String.valueOf(number) + x2 + x3).chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.toCollection(TreeSet::new));

        return set.size() == 10;
    }
}
