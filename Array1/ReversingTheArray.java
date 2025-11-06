// https://www.naukri.com/code360/problems/reverse-the-array_1262298?leftPanelTabValue=PROBLEM
import java.util.*;


public class ReversingTheArray {
    
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int i=m+1;
        int j=arr.size()-1;
        while(i<=j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void swap(ArrayList<Integer> arr, int first, int second){
        int temp=arr.get(first);
        arr.set(first, arr.get(second));
        arr.set(second, temp);
    }
}
