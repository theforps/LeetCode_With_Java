package Tasks.Easy;

import java.util.*;

//https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum

public class Task2099 {
    public Task2099(int[] nums, int k)
    {
        System.out.println(Arrays.toString(maxSubsequence(nums, k)));
    }

    public int[] maxSubsequence(int[] nums, int k) {

        List<Integer> temp = new ArrayList<>();
        int[] result = new int[k];

        for(var x : nums)
            temp.add(x);

        for(short i = 0; i < nums.length-k; i++)
            temp.remove(Collections.min(temp));

        for(short i = 0; i < temp.size(); i++)
            result[i] = temp.get(i);

        return result;
    }
}
