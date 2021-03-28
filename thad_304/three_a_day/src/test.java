import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test {
    public static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashmap.containsKey(target - nums[i])){
                return new int[]{hashmap.get(target - nums[i]) , i};//可以直接获取两个KEY，数组中对应方式需要遍历。
            }
            hashmap.put(nums[i] , i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int target = 9;
        int[] nums = {2,7,6,9,3,5};
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
