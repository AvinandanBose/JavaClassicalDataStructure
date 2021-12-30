import java.util.Scanner;
public class Euclid {
    int gcd(int m, int n){
        while (n!=0){
        int r = m % n;
        m = n;
        n = r;
        }
        return  m;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Euclid e = new Euclid();
        System.out.println("Enter a first integer:");
        int i = sc.nextInt();
        System.out.println("Enter a second integer:");
        int j = sc.nextInt();
        System.out.println("Greatest common divisor of two integer "+i+" and "+j+":");
        int k = e.gcd(i,j);
        System.out.println(k);

    }
}
