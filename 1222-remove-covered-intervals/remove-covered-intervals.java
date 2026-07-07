class Solution {
    public int removeCoveredIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0])
                return b[1] - a[1]; // larger end first
            return a[0] - b[0];
        });

        int count = intervals.length;

        for (int i = 0; i < intervals.length - 1; i++) {

            if (intervals[i][0] == -1)
                continue;

            for (int j = i + 1; j < intervals.length; j++) {

                if (intervals[j][0] == -1)
                    continue;

                // i covers j
                if (intervals[i][0] <= intervals[j][0]
                        && intervals[i][1] >= intervals[j][1]) {

                    intervals[j][0] = -1;
                    intervals[j][1] = -1;
                    count--;
                }
            }
        }

        return count;
    }
}