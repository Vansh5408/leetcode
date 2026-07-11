import java.util.*;

class Solution {
    public int countCompleteComponents(int n, int[][] edges) {

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        // CHANGED: create adjacency list for every node
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int v = edges[i][0];
            int u = edges[i][1];

            map.get(v).add(u);
            map.get(u).add(v);
        }

        return components(map);
    }

    public int components(HashMap<Integer, ArrayList<Integer>> map) {

        int count = 0;
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();

        for (int node : map.keySet()) {

            if (visited.contains(node)) {
                continue;
            }

            q.add(node);

            int vertices = 0;   // CHANGED
            int edges = 0;      // CHANGED

            while (!q.isEmpty()) {

                int rv = q.poll();

                // CHANGED
                if (visited.contains(rv)) {
                    continue;
                }

                visited.add(rv);

                vertices++;                     // CHANGED
                edges += map.get(rv).size();    // CHANGED

                for (int i = 0; i < map.get(rv).size(); i++) {

                    int edge = map.get(rv).get(i);

                    if (!visited.contains(edge)) {
                        q.add(edge);
                    }
                }
            }

            edges /= 2;   // CHANGED: every edge counted twice

            // CHANGED: check if component is complete
            if (edges == (vertices * (vertices - 1)) / 2) {
                count++;
            }
        }

        return count;
    }
}