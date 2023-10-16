package Tasks.Easy;

import java.util.Arrays;

//https://leetcode.com/problems/missing-number

public class Task268 {
    public Task268(int[] nums)
    {
        System.out.println(missingNumber(nums));
    }

    public int missingNumber(int[] nums) {

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != i)
                return i;
        }
        return nums.length;
    }
}
