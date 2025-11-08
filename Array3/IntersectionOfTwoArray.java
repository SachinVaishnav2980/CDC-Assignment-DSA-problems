package Array3;

import java.util.ArrayList;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        
        int []nums1 = {1,2,2,1};
        int []nums2 = {2,2};
        System.out.println(intersection(nums1, nums2).toString());
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans=new ArrayList <Integer>();
        for(int i=0;i<nums1.length;i++){
            if(search(nums2, nums1[i])){
                if(!ans.contains(nums1[i])){
                    ans.add(nums1[i]);
                }
            }
        }
        int []res=new int[ans.size()];
        for(int k=0;k<ans.size();k++){
            res[k]=ans.get(k);
        }
        return res;
    }

    public static boolean search(int []nums2, int element){
        for(int index: nums2){
            if(index==element){
                return true;
            }
        }
        return false;
    }
}
