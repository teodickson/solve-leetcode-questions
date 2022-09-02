package Easy.TwoSum;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    // O(n) time and space complexity

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 8, 9};
        System.out.println(Arrays.toString(twoSum(arr, 12)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // Hashmap does not maintain the insertion order

        for(int i = 0; i < nums.length; i++) { // need to go until the second index is detected from the hashmap
            int num = nums[i];
            int diff = target - num;

            if(map.containsKey(nums[i])) { // To check if the 'diff' contains the value of 'nums[i]'
                return new int[] { map.get(num), i };
                // this is when num = '4'
                // and then map.get(4) equals position [2] and i is at [5]
            }

            map.put(diff, i);
        }

        return new int[] {};
    }
}