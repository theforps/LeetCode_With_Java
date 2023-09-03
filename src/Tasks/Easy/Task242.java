package Tasks.Easy;

import java.util.Arrays;

//https://leetcode.com/problems/valid-anagram

public class Task242 {
    public Task242(String s, String t)
    {
        System.out.println(isAnagram(s, t));
    }

    public boolean isAnagram(String s, String t) {

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
