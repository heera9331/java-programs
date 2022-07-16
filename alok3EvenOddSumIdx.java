
/**
 * Author: Heera Singh Lodhi
 * date 16/07/2021
 * Program: Alok3
 */

//s = 0
//if element == position
//    s+= element
//check s is even 
//and odd
class Main {
    static void evenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    
    public static void main(String args[]) {
        int n = 5;
        int s=0;
        int arr[] = {1, 5, 2, 1, 4};
        for(int i=0; i<n; i++) {
            if (arr[i] == i) {
                s = s*10+arr[i];
            }
        }
        evenOdd(s);
    }
}
