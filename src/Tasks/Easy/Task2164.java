package Tasks.Easy;

import java.util.Arrays;

//https://leetcode.com/problems/sort-even-and-odd-indices-independently

public class Task2164 {
    public Task2164(int[] nums)
    {
        System.out.println(Arrays.toString(sortEvenOdd(nums)));
    }

    public int[] sortEvenOdd(int[] nums) {

        int temp;

        for(var x : nums)
        {
            for(int j = 0; j < nums.length; j++)
            {
                if(j + 2 < nums.length) {
                    if (j % 2 == 0 && nums[j] > nums[j + 2]) {
                        temp = nums[j];
                        nums[j] = nums[j + 2];
                        nums[j + 2] = temp;
                    }
                    else if (nums[j] < nums[j + 2] && j % 2 == 1) {
                        temp = nums[j];
                        nums[j] = nums[j + 2];
                        nums[j + 2] = temp;
                    }
                }
            }
        }
        return nums;
    }
}
