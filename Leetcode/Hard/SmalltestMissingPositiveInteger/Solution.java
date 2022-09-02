package Hard.SmalltestMissingPositiveInteger;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {0,1,1,2,2};
        System.out.println("The first missing positive number is " + firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int ans = 1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == ans) {
                ans++;
            }
        }
        return ans;
    }
}
