/**
 * Author: Heera Singh Lodhi
 * Date: 17/07/2022
 * Program: Array odd element combine with one numbern and check buzz or not?
 */
class Main{
    static boolean isBuzzNum(int n) {
        if(n%7 == 0 || n % 10 == 7) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        int n = 7;
        int[] arr = {2,4,5,2,2,2, 7};
        int oddSum=0;
        for(int i=0;i<n; i++) {
            if(arr[i] % 2 != 0) {
                oddSum = oddSum*10+arr[i];
            }
        }
        if (isBuzzNum(oddSum)){
            System.out.println("Buzz Sum");
        } else {
            System.out.println("Not Buzz Sum");
        }
    }

}
