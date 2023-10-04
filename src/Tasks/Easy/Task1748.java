package Tasks.Easy;

import java.util.Arrays;

//https://leetcode.com/problems/sum-of-unique-elements

public class Task1748 {
    public Task1748(int[] nums)
    {
        System.out.println(sumOfUnique(nums));
    }

    public int sumOfUnique(int[] nums) {
        int sum = 0;

        for(var x : nums)
            if(Arrays.stream(nums).filter(k -> k == x).count() == 1)
                sum += x;

        return sum;
    }
}
