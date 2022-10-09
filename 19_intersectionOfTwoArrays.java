/*

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
*/

class Solution {
    boolean isExists(int[] arr, int k) {
        for(int i : arr) {
            if (i == k) 
                return true;
        }
        return false;
    }
    
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        if (nums1.length > nums2.length) {
            for(int i=0; i<nums2.length; i++) {
                int currEle = nums2[i];
                if (isExists(nums1, currEle) == true) {
                    if(!arr.contains(currEle)) {
                        arr.add(currEle);
                    }
                }
            }
            
        } else {
            for(int i=0; i<nums1.length; i++) {
                int currEle = nums1[i];
                if (isExists(nums2, currEle) == true) {
                    if(!arr.contains(currEle)) {
                        arr.add(currEle);
                    }
                }
            }
        }
        int ans[] = new int[arr.size()];
        
        for(int i=0; i<arr.size(); i++) {
            ans[i]=arr.get(i);
        }
        
        return ans;
        
    }
} 
