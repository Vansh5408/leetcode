class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int []prefix=new int [travel.length];
        prefix[0]=travel[0];
        for(int i=1;i<travel.length;i++){
            prefix[i]=travel[i]+prefix[i-1];
        }
        int m=0;
        int p=0;
        int g=0;
        int mi=0;
        int pi=0;
        int gi=0;
        for(int i=0;i<garbage.length;i++){
            String s =garbage[i];
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='M'){
                    m++;
                    mi=i;
                }
                else if(s.charAt(j)=='P'){
                    p++;
                    pi=i;
                }
                else{
                    g++;
                    gi=i;
                }
            }
        }
        int ans =m+p+g;
        if(mi!=0){
            ans+=prefix[mi-1];
        }
        if(pi!=0){
            ans+=prefix[pi-1];
        }
        if(gi!=0){
            ans+=prefix[gi-1];
        }
        return ans;
    }
}