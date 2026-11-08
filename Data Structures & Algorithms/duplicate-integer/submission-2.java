class Solution {
    public boolean hasDuplicate(int[] nums) {
        // method 1
        // Arrays.sort(nums);
        // int n = nums.length;
        // for(int i=0;i<n-1;i++){
        //     if(nums[i] == nums[i+1]){
        //         return true;
        //         }
        // }
        // return false;

        //Method 2;
        Set<Integer>s = new HashSet<>();
        for(int num : nums){
            if(s.contains(num)){
                return true;
            }
            s.add(num);
        }
        return false;
    }
}