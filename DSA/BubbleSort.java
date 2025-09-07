// time complexity O(n^2)
public class BubbleSort {
    static int[] unsortedArray = {2,6,3,9,0,4,5};
    
    public static void main(String[] args) {
        int size = unsortedArray.length;
        int temp = 0;

        for (int i =0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if(unsortedArray[j] > unsortedArray[j + 1]) {
                    temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                }
            }
        }

        for (int num : unsortedArray) {
            System.out.print(num + " ");
        }
    }
}
