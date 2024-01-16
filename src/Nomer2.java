import java.util.ArrayList;
import java.util.Arrays;

public class Nomer2 {

    public static void main(String[] args) {
        ArrayList<String> mobil = new ArrayList<>(Arrays.asList("Lamborghini", "BWM", "Ford", "Civic"));
        boolean[] condition = getNameInPrima(mobil);
        for (int i = 0; i < condition.length; i++) {
            System.out.println(mobil.get(i) + ": " + condition[i]);
        }
    }

    public static boolean[] getNameInPrima(ArrayList<String> p) {
        boolean[] condition = new boolean[p.size()];
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        for (int i = 0; i < p.size(); i++) {
            String name = p.get(i);
            int count = 0;
            for (char c : name.toCharArray()) {
                if (Arrays.binarySearch(primes, c - 'A' + 1) >= 0) {
                    count++;
                }
            }
            condition[i] = count == name.length();
        }
        return condition;
    }
}