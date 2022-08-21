class Solution
{
   static boolean check(int[] arr1, int key) {
        int n = arr1.length;
        for(int i=0; i<n; i++) {
            if (arr1[i] == key) {
                return true;
            }
        }
        return false;
    }
    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here
        int key;
        ArrayList <Integer> list = new ArrayList<>();
        int n = A.length;
        for(int i=0; i<n; i++) {
            key = A[i];
            if (check(B, key) && check(C, key) ) {
               if (!list.contains(key)) {
                    list.add(key);
                }
            }
        }
        return list;
    }
    
}
