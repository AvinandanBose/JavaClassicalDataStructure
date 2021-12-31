import java.util.ArrayList;
import java.util.Scanner;
public class MiddleSchoolProc {
    public static void main(String[] args) {
        MiddleSchoolProc mcp = new MiddleSchoolProc();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first integer:");
        int i = sc.nextInt();
        System.out.println("Enter a second integer:");
        int j = sc.nextInt();
        mcp.gcd(i,j);

    }

    ArrayList<Integer> primefact(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                factors.add(i);
            }
        }
        return factors;
    }
    void gcd(int m, int n) {
        int IndexA = 0;
        int IndexB = 0;
        int res = 1;
        ArrayList<Integer> FactOfM = primefact(m);
        ArrayList<Integer> FactOfN = primefact(n);
        ArrayList<Integer> result = new ArrayList<>();
        System.out.println("Prime factors of " + m + ":" + FactOfM);
        System.out.println("Prime factors of " + n + ":" + FactOfN);
        while (IndexA < FactOfM.size() && IndexB < FactOfN.size()) {
            if (FactOfM.get(IndexA) == FactOfN.get(IndexB)) {
                result.add(FactOfM.get(IndexA));
                IndexA++;
                IndexB++;
            } else if (FactOfM.get(IndexA) < FactOfN.get(IndexB)) {
                IndexA++;
            } else {
                IndexB++;
            }
        }
        for(int k=0;k<result.size();k++ ){
             ;
            res = res* result.get(k);
        }
        System.out.println("Prime Factors in GCD ("+m+","+n+")=" + result);
        System.out.println("GCD ("+m+","+n+")=" + res);

    }
}