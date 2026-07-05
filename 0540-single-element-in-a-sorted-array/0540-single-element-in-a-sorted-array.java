class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }
}

//Time Complexity (TC)
//O(log n)
// In each iteration, the search space is reduced by half, just like standard binary search.
// Space Complexity (SC)
// O(1)
// Only a few variables (left, right, mid) are used, with no extra data structures.