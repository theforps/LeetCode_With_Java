package Tasks.Medium;

import java.util.*;

//https://leetcode.com/problems/group-anagrams

public class Task49 {
    public Task49(String[] strs)
    {
        System.out.println(groupAnagrams(strs));
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();


        for (String word: strs)
        {
            char[] charArray = word.toCharArray();

            Arrays.sort(charArray);

            String sortedWord = String.valueOf(charArray);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        List<List<String>> result = new ArrayList<>(map.values());

        return result;
    }
}
