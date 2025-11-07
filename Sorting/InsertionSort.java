package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 4, 1, 3, 9, 7 };
        insertionSort(arr);
        System.out.println(arr.toString());
    }

    // TC:O(n2), SC:o(1)
    static void insertionSort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && nums[j - 1] > nums[j]) {
                swap(nums, j - 1, j);
                j--;
            }
        }
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
