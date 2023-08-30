package Tasks;

//https://leetcode.com/problems/maximum-difference-between-increasing-elements/submissions/1035909842/

public class Task2016 {
    public Task2016(int[] nums)
    {
        System.out.println(maximumDifference(nums));
    }

    public int maximumDifference(int[] nums) {

        int max = -1;

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {
                if(i < j && nums[i] < nums[j])
                {
                    max = Math.max(max, (nums[j] - nums[i]));
                }
            }
        }
        return max;
    }
}
