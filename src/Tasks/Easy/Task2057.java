package Tasks.Easy;

//https://leetcode.com/problems/smallest-index-with-equal-value

public class Task2057 {
    public Task2057(int[] nums)
    {
        System.out.println(smallestEqual(nums));
    }

    public int smallestEqual(int[] nums) {

        for(int i = 0; i < nums.length; i++)
            if(i % 10 == nums[i])
                return i;

        return -1;
    }
}
