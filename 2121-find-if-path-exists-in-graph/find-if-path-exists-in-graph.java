class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            if(!map.containsKey(u)){
                map.put(u,new ArrayList<>());
            }
            map.get(u).add(v);
            if(!map.containsKey(v)){
                map.put(v,new ArrayList<>());
            }
            map.get(v).add(u);
        }
        boolean ans = check(map,source,destination,new HashSet<>());
        return ans;
    }
    public boolean check(HashMap<Integer,ArrayList<Integer>> map,int src,int des,HashSet<Integer>set){
        if(src==des){
            return  true;
        }
        set.add(src);
         for (int nbr : map.get(src)) {
        if (!set.contains(nbr)) {
            if (check(map, nbr, des, set)) {
                return true;
            }
        }
    }
        return false;
    }
}