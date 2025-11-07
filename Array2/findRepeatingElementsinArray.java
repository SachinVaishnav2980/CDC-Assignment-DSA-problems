package Array2;

import java.util.*;

public class findRepeatingElementsinArray {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,4,5,2};
        System.out.println(findRepeatingElements(arr).toString());
    }


    //Sorting approach- O(nlogn+n)
    static int [] findRepeatingElements(int arr[]){
        Arrays.sort(arr);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            if(j<arr.length && arr[i]==arr[j]){
                list.add(arr[i]);
                while (i+1<arr.length && arr[i+1]==arr[i]) {
                    i++;
                }
            }
        }
        int []ans=new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }

    //Map based approach- O(n)
    static int [] findRepeatingElementsMap(int arr[]){
        List<Integer> list=new ArrayList<>();
        Map<Integer, Integer> map=new HashMap<>();
        for(int element:arr){
            map.put(element, map.getOrDefault(element, 0)+1);
            if(map.get(element)>1){
                list.add(element);
            }
        }

        int []ans=new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}
