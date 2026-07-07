class Solution {
    private int countPartition(int[] arr, int maxSum){
        int partition =1;
        int subArrSum = 0;

        for(int num : arr){
            if(subArrSum + num <= maxSum){
                subArrSum += num;
            }else{
                partition++;
                subArrSum = num;
            }
        }
        return partition; 
    }
    public int splitArray(int[] nums, int k) {
        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();

        while(low <= high){
            int mid = (low + high)/2;
            int partition = countPartition(nums,mid);

            if(partition > k){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return low;
    }
}