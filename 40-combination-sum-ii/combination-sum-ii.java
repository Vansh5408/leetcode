class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        sum(ans, new ArrayList<>(), candidates, target, 0);
        return ans;
    }

    public void sum(List<List<Integer>> ans, List<Integer> l, int[] arr,
            int target, int idx) {

        if (target == 0) {
            ans.add(new ArrayList<>(l));
            return;
        }
        if (target < 0)
            return;
        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1])
                continue;
            if (arr[i] > target)
                break;
            l.add(arr[i]);
            sum(ans, l, arr, target - arr[i], i + 1);
            l.remove(l.size() - 1);
        }
    }
}