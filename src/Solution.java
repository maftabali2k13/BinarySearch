public class Solution {
    int binarySearch(int[] nums, int target)
    {
        if(nums.length == 0 || nums == null)
            return -1;

        int left = 0;
        int right = nums.length;


        while(left + 1 < right)
        {
            int mid = (left + right)/2;

            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                left = mid;
            else
                right = mid;
        }

        if(nums[left] == target)
            return left;
        return -1;
    }
}
