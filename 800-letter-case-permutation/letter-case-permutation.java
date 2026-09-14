class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        return permutation(s, ans, 0);
    }

    public List<String> permutation(String s, List<String> ans, int i) {
        if (i == s.length()) {
            ans.add(s);
            return ans;
        }

        if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
                (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {

            String temp = s.substring(0, i) +Character.toLowerCase(s.charAt(i)) + s.substring(i + 1);

            permutation(temp, ans, i + 1);

            temp = s.substring(0, i) +
                    Character.toUpperCase(s.charAt(i)) +
                    s.substring(i + 1);

            permutation(temp, ans, i + 1);
        } else {
            permutation(s, ans, i + 1);
        }

        return ans;
    }
}