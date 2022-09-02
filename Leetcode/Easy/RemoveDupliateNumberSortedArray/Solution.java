package Easy.RemoveDupliateNumberSortedArray;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        int len = nums.length;
        for(int i = 0; i < len;) {
            while(i + 1 < len && nums[i + 1] - nums[i] == 0) {
                i++;
            }
            nums[count++] = nums[i++];
        }
        return count;
    }
}
