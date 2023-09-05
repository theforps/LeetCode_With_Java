package Tasks.Easy;

import java.util.Arrays;

//https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays

public class Task1460 {
    public Task1460(int[] target, int[] arr)
    {
        System.out.println(canBeEqual(target, arr));
    }

    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);

        return Arrays.equals(target, arr);
    }
}
