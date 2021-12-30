import java.util.ArrayList;

public class PrimeFactor {
    ArrayList<Integer> primefac(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                factors.add(i);
            }
        }
        return factors;
    }


    public static void main(String[]args){
        PrimeFactor mcp = new PrimeFactor();
        System.out.println(mcp.primefac(400));
    }
}
