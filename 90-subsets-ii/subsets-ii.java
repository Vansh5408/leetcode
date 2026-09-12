class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        return sub(ans, new ArrayList<>(), set, nums, 0);
    }

    public List<List<Integer>> sub(List<List<Integer>> ans, List<Integer> l,
            HashSet<ArrayList<Integer>> set, int[] arr, int i) {
        if (i == arr.length) {
            ArrayList<Integer> temp = new ArrayList<>(l);
            Collections.sort(temp);

            if (!set.contains(temp)) {
                ans.add(temp);
                set.add(temp);
            }

            return ans;
        }

        l.add(arr[i]);
        sub(ans, l, set, arr, i + 1);

        l.remove(l.size() - 1);
        sub(ans, l, set, arr, i + 1);

        return ans;
    }
}