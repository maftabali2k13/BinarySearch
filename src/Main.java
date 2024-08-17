public class Main {
    public static void main(String[] args) {

        int[] nums = {1,3,5,7,9};

        int target = 19;

        for(int i=0;i < 10;i++)
            System.out.println(i + " Hello world!");

        Solution sol = new Solution();
        System.out.println("Index is " + sol.binarySearch(nums, target));
    }
}