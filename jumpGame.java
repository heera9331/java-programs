
/*
 * Author: Heera Singh Lodhi
 * Date: 19/07/2022
 * Program: Jumping Game
 */

class Main {
    static int solve(int[] nums) {
        int n = nums.length;
        int count=1;
        int i=1;
        while(true) {
            if(i == n-2) {
                break;
            } else {
                i+=2;
                count++;
                if(i==n-2) {
                    break;
                } else {
                    i-=1;
                    count++;                 
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int[] arr = {5, 6, 8, 9, 1, 7, 5};
        System.out.println(solve(arr));
    }
}
