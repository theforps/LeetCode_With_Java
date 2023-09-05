package Tasks.Easy;

import java.util.Map;
import java.util.TreeMap;

//https://leetcode.com/problems/shuffle-string

public class Task1528 {
    public Task1528(String s, int[] indices)
    {
        System.out.println(restoreString(s, indices));
    }

    public String restoreString(String s, int[] indices) {
        String result = "";
        Map<Integer, Character> dict = new TreeMap<>();

        for(int i = 0; i < s.length(); i++)
            dict.put(indices[i], s.charAt(i));

        for(int i = 0; i < dict.size(); i++)
            result = result.concat(dict.get(i).toString());

        return result;
    }
}
