
import java.util.Scanner;
class alok1 {
    static int digitSum(int n) {
        int sum=0;
        
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    static void solve(int n) {
        if (100000 < n && 999999 > n) {
            for(int i=100000; i<=n; i++) {
                if (digitSum(i) == 15) {
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        solve(a);

    }
}
