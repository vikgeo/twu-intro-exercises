import java.util.ArrayList;

public class Factors {

    public static ArrayList factorize(int n){
        ArrayList<Integer> factors = new ArrayList<>();
        int factor = 2;
        while (factor <= n){
            if (n%factor == 0) {
                factors.add(factor);
                n /= factor;
            } else {
                factor ++;
            }

        }
        return factors;
    }
}
