class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        ArrayList<Integer>ans = new ArrayList<>();
        Arrays.sort(nums);
        int a =nums[0];
        int b= nums[nums.length-1];
        for(int i=a+1;i<=b-1;i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}