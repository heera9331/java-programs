
import java.util.Scanner;

// special number

class makePenlindromeStringWithMinSwap {
    static Boolean isPrime(int n) {
        if(n == 1) {
            return true;
        }
        for(int i=2;i<n/2;i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static Boolean isPerfectNum(int n) {
        int n1 = n, s=0;
        while(n != 0) {
            int r = n%10;
            s += r;
            n /= 10;
        }
        return n1 == s;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            int re = a - b;
            if(isPerfectNum(re)) {
                System.out.println("Number is perfect");
            } else{
                System.out.println("Number is not perfect");
            }
        } else {
            int re = b - a;
            if(isPerfectNum(re)) {
                System.out.println("Number is perfect");
            }else {
                System.out.println("Number is not perfect ");
            }
        }


    }
}
