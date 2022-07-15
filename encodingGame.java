import java.util.Scanner;

class encodingGame {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);

    if(ch >= 'A' && ch <= 'Z') {
      System.out.println("Enter number: ");
      int n = sc.nextInt();
      n = n%26;

      int m = n + ch;

      if(m <= 'Z') {
        System.out.println((char)m);
      } else {
        int l = m - 'Z';
        System.out.println((char)('A' + l-1));
      }
    } else{
      System.out.println("Invalid char");
    }
  }
}
