package Array2;
// https://leetcode.com/problems/find-pivot-index/description/-Find pivot index
public class EquilibriumElementinArray {
    public static void main(String[] args) {
        int []nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int n=nums.length;
        int[]prefix=new int[n];
        int []suffix=new int [n];
        prefix[0]=0;
        suffix[n-1]=0;

        //Building the prefix array
        for(int i=1;i<n;i++){
            prefix[i]=nums[i-1]+prefix[i-1];
        }

        //Building the suffix array
        for(int i=n-2;i>=0;i--){
            suffix[i]=nums[i+1]+suffix[i+1];
        }

        for(int i=0;i<n;i++){
            if(prefix[i]==suffix[i]){
                return i;
            }
        }
        return -1;
    }
}
