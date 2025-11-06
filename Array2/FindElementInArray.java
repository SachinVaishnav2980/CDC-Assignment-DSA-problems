package Array2;

public class FindElementInArray {
    public static void main(String[] args) {
        int []arr = {10, 8, 30, 4, 5};
        int x = 5;
        System.out.println(search(arr, x));
    }

    //Unsorted array- Linear Search
    // TC:O(n), SC:O(1);
    public static int search(int arr[], int x) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
