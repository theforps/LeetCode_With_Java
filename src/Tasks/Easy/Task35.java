package Tasks.Easy;

import java.util.Arrays;

public class Task35 {
    public Task35(int[] nums, int target)
    {
        System.out.println(searchInsert(nums, target));
    }

    public int searchInsert(int[] nums, int target) {

        int size = nums.length;

        for(int i = 0; i < size; i++)
        {
            if(nums[i] >= target)
                return i;

            if(i+1 < size
                    && nums[i] < target
                    && nums[i+1] >= target)
                return i+1;

        }
        return size;
    }
}
