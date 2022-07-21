
/**
 * Author: Heera Singh Lodhi
 * date 21/07/2022
 * program: Swap first and last char of given string
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] ch = str.toCharArray();
        int n = ch.length;

        // swap
        char t = ch[0];
        ch[0] = ch[n-1];
        ch[n-1] = t;

        String s = ch.toString();

        System.out.println(s);

    }
}
