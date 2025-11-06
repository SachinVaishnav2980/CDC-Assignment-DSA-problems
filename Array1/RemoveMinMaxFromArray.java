// https://leetcode.com/problems/removing-minimum-and-maximum-from-array/description/.
public class RemoveMinMaxFromArray {
    public static void main(String[] args) {
        int []nums = {2,10,7,5,4,1,8,6};
        System.out.println(minimumDeletions(nums));
    }

    public static int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minIndex=0;
        int maxIndex=0;
        int n=nums.length;
        if(n==1) return 1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                minIndex=i;
            }
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }
        }
        //case1 when both in front
        int frontRemoval=minIndex<maxIndex?maxIndex+1:minIndex+1;
        //case2 when both in last
        int lastRemoval=minIndex<maxIndex?n-minIndex:n-maxIndex;
        //case3 in between
        int midRemoval=minIndex<maxIndex?(minIndex+1)+(n-maxIndex):(maxIndex+1)+(n-minIndex);
        //ans is min of all three
        return Math.min(frontRemoval, Math.min(lastRemoval, midRemoval));
    }
}