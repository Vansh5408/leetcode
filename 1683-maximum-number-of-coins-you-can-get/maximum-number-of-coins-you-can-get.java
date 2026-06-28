class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int maxPiles=0;
        int i =piles.length/3;
        for(int j=i;j<piles.length;j+=2){
            maxPiles+=piles[j];
        }
        return maxPiles;
    }
}