package Tasks.Easy;

import java.util.HashMap;

//https://leetcode.com/problems/roman-to-integer

public class Task13 {
    public Task13(String s)
    {
        System.out.println(romanToInt(s));
    }

    public int romanToInt(String s) {
        int result = 0;
        HashMap<Character, Integer> dictionary = new HashMap<>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        for(int i = 0; i < s.length(); i++)
        {
            if(i+1 < s.length() && dictionary.get(s.charAt(i)) <  dictionary.get(s.charAt(i+1)))
            {
                result -= dictionary.get(s.charAt(i));
            }
            else {
                result += dictionary.get(s.charAt(i));
            }
        }
        return result;
    }
}
