class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<rooms.size();i++){
            map.put(i,new ArrayList<>());
            for(int j=0;j<rooms.get(i).size();j++){
                map.get(i).add(rooms.get(i).get(j));
            }
        }
        boolean ans =check(map);
        return ans;
    }
    public boolean check(HashMap<Integer,ArrayList<Integer>> map){
        int count =0;
        HashSet<Integer>visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<map.size();i++){
            if(visited.contains(i)){
                continue;
            }
            if(count>1) return false;
            q.add(i);
            while(!q.isEmpty()){
                int rv = q.poll();
                if(visited.contains(rv)){
                    continue;
                }
                visited.add(rv);
                for(int j=0;j<map.get(rv).size();j++){
                    int edge = map.get(rv).get(j);
                    if(!visited.contains(edge)){
                        q.add(edge);
                    }
                }
            }
            count++;
        }
        if(count==1) return true;
        return false;
    }
}