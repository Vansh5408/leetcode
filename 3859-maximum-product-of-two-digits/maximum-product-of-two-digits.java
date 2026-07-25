class Solution {
    public int maxProduct(int n) {
        int []arr = new int [10];
        while(n!=0){
            arr[n%10]++;
            n=n/10;
        }
        int a =0;
        int b=0;
        int c=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0 && arr[i]==1){
                a=i;
                c=i;
                break;
            }
            if(arr[i]!=0 && arr[i]>1){
                a=i;
                b=i;
                break;
            }
        }
        if(b==0){
              for(int i=c-1;i>=0;i--){
            if(arr[i]!=0){
                b=i;
                break;
            }
        }
        }
        return a*b;
    }
}