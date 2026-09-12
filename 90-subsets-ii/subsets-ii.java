class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        return sub(ans, new ArrayList<>(), nums, 0);
    }

    public List<List<Integer>> sub(List<List<Integer>> ans, List<Integer> l,
            int[] arr, int i) {

        if (i == arr.length) {
            ans.add(new ArrayList<>(l));
            return ans;
        }

        // Take
        l.add(arr[i]);
        sub(ans, l, arr, i + 1);
        l.remove(l.size() - 1);

        // Skip duplicates
        int j = i + 1;

        while (j < arr.length && arr[j] == arr[i]) {
            j++;
        }

        // Not Take
        sub(ans, l, arr, j);

        return ans;
    }
}