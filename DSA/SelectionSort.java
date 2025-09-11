// time complexity O(n^2)
public class SelectionSort {
    static int[] nums = {2,6,3,9,0,4,5};
    public static void main (String[] args) {
        int size = nums.length;

        for (int i = 0; i < size; i++) {
            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;

        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
