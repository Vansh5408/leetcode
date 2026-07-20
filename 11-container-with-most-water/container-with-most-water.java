class Solution {
    public int maxArea(int[] height) {
        int max =0;
        int l=0;
        int r= height.length-1;
        while(l<r){
            int left = height[l];
            int right=height[r];
         max = Math.max(max,(Math.min(left,right))*(r-l));
            if(left<right){
                l++;
            }
            else{
                r--;
            }
        }
        return max;

    }
}