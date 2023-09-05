package Tasks.Easy;

import java.util.*;

//https://leetcode.com/problems/kth-missing-positive-number

public class Task1539 {
    public Task1539(int[] arr, int k)
    {
        System.out.println(findKthPositive(arr, k));
    }

    public int findKthPositive(int[] arr, int k) {
        Set<Integer> set =new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(var x : arr)
            set.add(x);

        for (int i = 1; list.size() < k; i++)
        {
            if(!set.contains(i))
                list.add(i);
        }
        return list.get(k-1);
    }
}
