import java.util.HashSet;
import java.util.Set;

public class test_4_1 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num:nums) {
            set.add(num);
        }
//        if (set.size()<nums.length){
//            return true;
//        }else {
//            return false;
//        }
        //直接return
        return set.size()<nums.length;
    }
}
