import java.util.Arrays;

public class BinarySearch {
    static int numsArray[] = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) {
        int result = binarySearch(numsArray, 5);
        System.out.println("The result is: " + result);
    }

    public static int binarySearch (int[] nums, int target) {
        int mid = (nums.length + 1) / 2;

        if(nums[mid] == target){
            return nums[mid];
        } else if(nums[mid] > target){
            return binarySearch(Arrays.copyOfRange(nums, 0, mid), target);
        } else {
            return binarySearch(Arrays.copyOfRange(nums, mid, nums.length), target);
        }
    } 

}
