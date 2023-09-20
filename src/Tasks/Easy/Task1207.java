package Tasks.Easy;

import java.util.*;

//https://leetcode.com/problems/unique-number-of-occurrences

public class Task1207 {
    public Task1207(int[] arr)
    {
        System.out.println(uniqueOccurrences(arr));
    }

    public boolean uniqueOccurrences(int[] arr) {

        Set<Integer> uniqueNum = new HashSet<>();
        List<Integer> counter = new ArrayList<>();

        for(var x : arr)
            uniqueNum.add(x);

        for(var x : uniqueNum)
            counter.add((int)Arrays.stream(arr).filter(i -> i == x).count());

        return counter.size() == counter.stream().distinct().toList().size();
    }
}
