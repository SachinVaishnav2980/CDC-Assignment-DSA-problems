// https://leetcode.com/problems/count-elements-with-maximum-frequency/description/
import java.util.HashMap;
import java.util.Map;

public class CountElementWithMaxFreq {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();
        int max=0;
        for(int element:nums){
            map.put(element, map.getOrDefault(element, 0)+1);
            max=Math.max(max, map.get(element));
        }
        int total=0;
        for(Map.Entry<Integer, Integer> entry :map.entrySet()){
            if(entry.getValue()==max){
                total+=(max);
            }
        }
        return total;
    }
}
