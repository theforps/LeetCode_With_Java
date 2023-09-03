package Tasks.Easy;

//https://leetcode.com/problems/largest-number-at-least-twice-of-others

import java.util.Arrays;

public class Task747 {
    public Task747(int[] nums)
    {
        System.out.println(dominantIndex(nums));
    }

    public int dominantIndex(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int maxId = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 0 && max / nums[i] < 2 && max != nums[i])
            {
                return -1;
            }
            else if (nums[i] == max)
            {
                maxId = i;
            }
        }
        return maxId;
    }
}
