class Solution {
    public int minimumPushes(String word) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : word.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Integer> freq = new ArrayList<>(map.values());

        freq.sort(Collections.reverseOrder());

        int ans = 0;

        for (int i = 0; i < freq.size(); i++) {
            ans += ((i / 8) + 1) * freq.get(i);
        }

        return ans;
    }
}