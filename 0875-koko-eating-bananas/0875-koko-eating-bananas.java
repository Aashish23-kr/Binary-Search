class Solution {
    public int hourSum(int[] a , int hourly){
        int total =0;
        for(int num : a){
            total += Math.ceil((double)num/hourly);
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().getAsInt();
        int low = 1, high = max;
        while(low < high){
            int mid = low + (high-low)/2;
            int totalhour = hourSum(piles,mid);
            if(totalhour <= h){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}