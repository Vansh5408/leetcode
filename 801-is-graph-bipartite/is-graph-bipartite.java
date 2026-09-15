class Solution {
    public boolean isBipartite(int[][] graph) {
        return biprate(graph);
    }

    public boolean biprate(int[][] graph) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<pair> q = new LinkedList<pair>();
        for (int i = 0; i < graph.length; i++) {
            if (map.containsKey(i))
                continue;
            q.add(new pair(i, 0));
            while (!q.isEmpty()) {
                pair rv = q.poll();
                if (map.containsKey(rv.src)) {
                    if (rv.distance != map.get(rv.src))
                        return false;
                    else {
                        continue;
                    }
                }
                map.put(rv.src, rv.distance);
                for (int nbrs : graph[rv.src]) {
                    if (!map.containsKey(nbrs)) {
                        q.add(new pair(nbrs, rv.distance + 1));
                    }
                }
            }
        }
        return true;
    }

    class pair {
        int src;
        int distance;

        public pair(int src, int distance) {
            this.src = src;
            this.distance = distance;
        }
    }

}
