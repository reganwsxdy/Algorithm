import java.util.Arrays;

public class test_1_1 {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2,7,4,5,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }

//    作者：LeetCode-Solution
//    链接：https://leetcode-cn.com/problems/two-sum/solution/liang-shu-zhi-he-by-leetcode-solution/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
