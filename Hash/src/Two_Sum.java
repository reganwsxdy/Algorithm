import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 题目描述：给定一个数组和一个he，返回能相加成he的两个数组元素的下标，假设答案只有一种
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * */

public class Two_Sum {
    public static int[] twoSum(int[] nums, int target){
        Map<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

             if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i] , i);//先找后放，防止找到的是自己
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int target = 6;
        int[] nums = {3,2,4};
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
