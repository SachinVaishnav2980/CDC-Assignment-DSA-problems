package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {4, 1, 3, 9, 7};
        bubbleSort(arr);
        System.out.println(arr.toString());
    }

    //TC:O(n2) , SC:O(1);
    public static void bubbleSort(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]<arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }
    
    static void swap(int []arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
