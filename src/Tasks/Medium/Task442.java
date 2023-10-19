package Tasks.Medium;

import java.util.*;

//https://leetcode.com/problems/find-all-duplicates-in-an-array

public class Task442 {
    public Task442(int[] nums)
    {
        System.out.println(findDuplicates(nums));
    }

    public List<Integer> findDuplicates(int[] nums) {

        Set<Integer> result = new TreeSet<>();
        List<Integer> checked = new ArrayList<>();

        int temp;

        for(var x : nums)
        {
            if(!checked.contains(x)) {
                temp = (int) Arrays.stream(nums).filter(k -> k == x).count();
                checked.add(x);

                if(temp > 1) {
                    result.add(x);
                }
            }
        }

        return result.stream().toList();
    }
}
