// circle game/football game

import java.util.Scanner;
class Main {
    static int jumpCount(String str) {
        int count=0;
        int n = str.length()-1;
        int l = str.length();

        count = n/3;
        if(n%3 == 0) {
            return count;
        } else {
            n = l - l%3;
            count += (n/2)+1;
            if(n%2 == 0) {
                count += count+n/2;
                 
            } else {
                n = l - l%2;
                count += n+1;
                return count;   
            }
        }
        return count;
    }
    
    /* another approach
    static int jumpCount(String str) {
        int n = str.length()-1;
        int l = str.length();
        int count=0;
        for(int i=3; i>=1; i--) {
            count += count/3;
            if(n%i == 0) {
                return count;
            } else {
                n = l - l%i;
                count += 1;
            }
        }
        return count;

    }
    */
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
      
        String str=sc.next();
        System.out.println(jumpCount(str));
    }
}
