import java.util.Scanner;

public class ConsIntCheckAlgo {
    int min(int i, int j){
        int result;
        if(i<j){
             result = i;
        }
        else{
             result = j;
        }
        return result;
    }
  int  gcd(int m, int n){
        int t = min(m,n);
        int i=0;
       for ( i =t;i>=1; i--){
           if(n%i ==0 && m%i ==0 ){
               break;
           }
       }
       return i;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ConsIntCheckAlgo cica = new ConsIntCheckAlgo();
        System.out.println("Enter a first integer:");
        int i = sc.nextInt();
        System.out.println("Enter a second integer:");
        int j = sc.nextInt();
        System.out.println("Greatest common divisor of two integer "+i+" and "+j+":");
        System.out.println(cica.gcd(i,j));
    }
}
