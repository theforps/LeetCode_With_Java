package Tasks.Easy;

import java.util.Arrays;
import java.util.HashSet;

//https://leetcode.com/problems/number-of-good-pairs

public class Task1512 {
    public Task1512(int[] nums)
    {
        System.out.println(numIdenticalPairs(nums));
    }

    public int numIdenticalPairs(int[] nums) {

        HashSet<String> pairs = new HashSet<>();

        for(int i = 0; i<nums.length; i++)
        {
            for(int j = 0; j<nums.length; j++)
            {
                if(nums[i] == nums[j] && i < j)
                {
                    char[] temp = {(char)nums[i], (char)nums[j]};
                    Arrays.sort(temp);

                    pairs.add(temp.toString());
                }
            }
        }
        return pairs.size();
    }
}
