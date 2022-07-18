/**
 * Author: Heera Singh Lodhi
 * date 18/07/2022
 * program: Permutation and Combination
 */


// permutation and combination
//nPr = n!/(n-r)!
//nCr = n! / r! * (n - r)!

// 5p2 = 20
// 5c2 = 10

import java.util.Scanner;
class Main {
    static int factorial(int n) {
        if(n == 1 || n == 0) {
            return 1;
        }

        int s = n * factorial(n - 1);
        return s;
    }

    static double nPr(int n, int r) {
        return factorial(n) / factorial(n-r);
    }

    static double nCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n-r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println((long)nPr(n,r));
        System.out.println((long)nCr(n,r));
    }
}
