public class Main {
    public static void main(String[] args) {

        int[] nums = {1,3,5,7,9};

        int target = 19;

        Solution sol = new Solution();
        System.out.println("Index is " + sol.binarySearch(nums, target));
    }
}