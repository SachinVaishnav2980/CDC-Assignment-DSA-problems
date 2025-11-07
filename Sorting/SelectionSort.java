package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {4, 1, 3, 9, 7};
        selectionSort(arr);
        System.out.println(arr.toString());
    }

    //TC:O(n2), SC:O(1)
    static void selectionSort(int [] nums){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[minIndex]){
                    minIndex=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[minIndex];
            nums[minIndex]=temp;
        }
    }
}
