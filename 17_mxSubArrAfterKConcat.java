/*
input: 
2
2 3
1 3
3 2
1 -2 1

output
12
2
*/

import java.util.* ;
import java.io.*; 
public class Solution {
    static long kadensAlgo(int arr[], int n) {
        long currSum=0;
        long maxSum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            currSum += arr[i];
            if(currSum > maxSum) {
                maxSum=currSum;
            }

            if(currSum < 0) {
                currSum=0;
            }
        }
        return maxSum;
    }
	public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
		int m = n*k;
        int a[] = new int[m];
        int c=0;
        while(k-- > 0) {
            for(int i=0; i<n; i++) {
                a[c++]=arr.get(i);
            }
        }
        long ans = kadensAlgo(a, m);
        return (ans);
	}
}
