
/*
 * Author: Heera Singh Lodhi
 * Date: 25/07/2022
 * Program: reverse string
 */
// 

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        int n = ch.length;
        for(int i=0; i<=n/2; i++) {
            char t=ch[i];
            ch[i] = ch[n-i-1];
            ch[n-i-1]=t;
        }

        String s = new String(ch);
        System.out.println(s);
    }
}
