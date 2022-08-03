class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        int n1 = nums.size();
        
        set<int>s;
        
        for(int i=0; i<n1; i++) {
            s.insert(nums[i]);
        }
        
        int n2 = s.size();
        
        if (n1 == n2) {
            return false;
        }
        return true;
    }
};
