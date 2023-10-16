package Tasks.Easy;

import java.util.Arrays;

//https://leetcode.com/problems/remove-element

public class Task27 {
    public Task27(int[] nums, int val)
    {
        System.out.println(removeElement(nums, val));
    }

    public int removeElement(int[] nums, int val) {

        int count = 0;

        for(int j = 0; j < nums.length; j++)
            for(int i = 0; i < nums.length - 1; i++)
            {
                if(nums[i] == val)
                {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }

        return (int)Arrays
                .stream(nums)
                .filter(x -> x != val)
                .count();
    }
}
