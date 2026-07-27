class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 && j >= 0) {
            char c = a.charAt(i);
            char d = b.charAt(j);

            if (c == '1' && d == '1') {
                if (carry == 0) {
                    ans.append(0);
                    carry = 1;
                } else {
                    ans.append(1);
                    carry = 1;
                }
            } else if ((c == '1' && d == '0') || (c == '0' && d == '1')) {
                if (carry == 0) {
                    ans.append(1);
                } else {
                    ans.append(0);
                    carry = 1;
                }
            } else {
                if (carry == 0) {
                    ans.append(0);
                } else {
                    ans.append(1);
                    carry = 0;
                }
            }

            i--;
            j--;
        }

        while (i >= 0) {
            char c = a.charAt(i);

            if (c == '0') {
                if (carry == 1) {
                    ans.append(1);
                    carry = 0;
                } else {
                    ans.append(0);
                }
            } else {
                if (carry == 0) {
                    ans.append(1);
                } else {
                    ans.append(0);
                    carry = 1;
                }
            }

            i--;
        }

        while (j >= 0) {
            char c = b.charAt(j);

            if (c == '0') {
                if (carry == 1) {
                    ans.append(1);
                    carry = 0;
                } else {
                    ans.append(0);
                }
            } else {
                if (carry == 0) {
                    ans.append(1);
                } else {
                    ans.append(0);
                    carry = 1;
                }
            }

            j--;
        }

        if (carry == 1) {
            ans.append(1);
        }

        return ans.reverse().toString();
    }
}