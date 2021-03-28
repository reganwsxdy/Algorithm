/**
 * 思路：边添加边遍历，可以大幅减少时间复杂度
 * */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test_1_2 {
    public static int[] twoSum(int[] nums,int target ){
        Map<Integer,Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashmap.containsKey(target-nums[i])){
                return new int[]{hashmap.get(target-nums[i]),i};
            }
            hashmap.put(nums[i],i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int target = 9;
        int[] nums = {2,7,6,9,3,5};
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}

class heap{
    public int findKthLargest_heap(int[] nums, int k){
        int n = nums.length;
        buildHeap(nums, nums.length);
        for (int i = nums.length-1; i>=nums.length-k+1; i--){
            swap(nums, 0, i);
            n--;
            adjustNode(nums, 0, n);
        }
        return nums[0];
    }

    public void buildHeap(int[] a, int length){
        for (int i = length/2-1; i>=0; i--){
            adjustNode(a, i, length);
        }
    }
    //调整单个位置（值和位置都要交换）,用递归，程序出口是当top的值没变（t != top）
    public void adjustNode(int[] a, int top, int length){
        int left = top*2+1, right = top*2+2;
        int t = top;
        if (left<length && a[left] > a[t]){
            t = left;
        }
        if (right<length && a[right]>a[t]){
            t = right;
        }
        if (t!=top){
            swap(a, top, t);
            adjustNode(a, t, length);
        }
    }

    public void swap(int[] a, int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
