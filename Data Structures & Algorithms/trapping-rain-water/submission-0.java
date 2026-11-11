class Solution {
    public int trap(int[] height) {
        int i = 0;
        int j = height.length-1;
        int leftMax = height[i];
        int rightMax = height[j];
        int amountWater = 0;
        if(height == null || height.length == 0){
            return 0;
        }
        while(i<j){
            if(leftMax < rightMax){
                i++;
                leftMax = Math.max(leftMax,height[i]);
                amountWater += leftMax - height[i];
            }
            else{
                j--;
                rightMax = Math.max(rightMax,height[j]);
                amountWater += rightMax - height[j];
            }
        }
        return amountWater;
    }
}
