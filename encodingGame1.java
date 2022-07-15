
import java.util.Scanner;

class Main {
    static void encodingGame(char ch, int n) {
            n = n % 26;
            char alph[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                    'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

            int valueOfChar=0;

            for(int i=0; i<alph.length; i++) {
                if(ch == alph[i]) {
                    valueOfChar = i;
                }
            }

            int m = valueOfChar+n;
            if (m<alph.length) {
                System.out.println(alph[m]);
            } else {
                m = m%26;
                System.out.println(alph[m]);
            }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter char: ");
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Enter number: ");
            int n = sc.nextInt();
            encodingGame(ch, n);
        } else {
            System.out.println("Invalid char");
        }
    }
}
