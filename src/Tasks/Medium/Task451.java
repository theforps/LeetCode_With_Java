package Tasks.Medium;

import java.util.*;

//https://leetcode.com/problems/sort-characters-by-frequency

public class Task451 {
    public Task451(String s)
    {
        System.out.println(frequencySort(s));
    }

    public String frequencySort(String s) {

        ArrayList<Integer> countChar = new ArrayList<>();
        HashSet<Character> unChar = new HashSet<>();
        HashMap<Character, Integer> collection = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(var x : s.toCharArray())
        {
            unChar.add(x);
        }
        for(var k : unChar)
        {
            countChar.add((int)(s.chars().filter(x -> x == k).count()));
        }
        for(int i = 0; i < countChar.size(); i++)
        {
            collection.put((char)unChar.toArray()[i], countChar.get(i));
        }

        var sorted = collection
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .toList();

        for(var x : sorted)
        {
            sb.append(x.getKey().toString().repeat(x.getValue()));
        }

        return sb.toString();
    }
}
