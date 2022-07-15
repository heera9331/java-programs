
public class sumOfPrimeInRange {
    static Boolean isPrime(int n) {
        if (n == 1){
            return true;
        }
        for(int i=2; i<=n/2; i++){
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    static int sumOfPrime(int n1, int n2)  {
        int sum=0;
        for(int i=n1; i<=n2; i++) {
            if(isPrime(i)) {
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String args[]) {
        System.out.println(sumOfPrime(2, 10));
    }
}
