package Tasks.Medium;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations

public class Task2442 {
    public Task2442(int[] nums)
    {
        System.out.println(countDistinctIntegers(nums));
    }

    public int countDistinctIntegers(int[] nums) {

        Set<Integer> uniq = new HashSet<>();
        StringBuilder sb;

        for (int num : nums) {
            sb = new StringBuilder(String.valueOf(num)).reverse();

            uniq.add(num);
            uniq.add(Integer.parseInt(sb.toString()));
        }
        return uniq.size();
    }
}
