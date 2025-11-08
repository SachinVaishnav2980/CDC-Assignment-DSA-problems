package Array3;
public class MaximumSubarrayProduct {
    public static void main(String[] args) {
        int []nums={2,3,-2,4};
        System.out.println(maxProduct(nums));
    }

    //using Kadane's algo.
    public static int maxProduct(int[] nums) {
        int maxProduct=nums[0];
        int minProduct=nums[0];
        int result=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=maxProduct;
                maxProduct=minProduct;
                minProduct=temp;
            }

            maxProduct=Math.max(nums[i], maxProduct*nums[i]);
            minProduct=Math.min(nums[i], minProduct*nums[i]);
            result=Math.max(result, maxProduct);
        }
        return result;
    }

    //Using Intutive approach
    //maitain leftmax and right max at each point. update the result by max. of both. 
    //if any point number becomes 0, just reset it to 1

    public static int maxProductArray(int[] nums) {
        int leftProduct=1;
        int rightProduct=1;
        int res=0;
        int n=nums.length;

        for(int i=0;i<nums.length;i++){
            leftProduct=nums[i] == 0 ?1:leftProduct;
            rightProduct=nums[n-1-i]==0?1:rightProduct;

            leftProduct*=nums[i];
            rightProduct*=nums[i];

            res=Math.max(leftProduct, rightProduct);
        }
        return res;
    }
}
