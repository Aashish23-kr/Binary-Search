class Solution {
    private int findSum(int[] nums,int div){
        int sum =0;
        for(int num : nums){
            sum += Math.ceil((double) num/div);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        if(nums.length > threshold) return -1;
        int left =0;
        int right = Arrays.stream(nums).max().getAsInt();

        while(left <= right){
            int mid = (left + right)/2;
            if(findSum(nums, mid) > threshold){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return left;
    }
}