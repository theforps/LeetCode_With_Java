package Tasks.Easy;

import java.util.*;

//https://leetcode.com/problems/decode-the-message

public class Task2325 {
    public Task2325(String key, String message)
    {
        System.out.println(decodeMessage(key, message));
    }

    public String decodeMessage(String key, String message) {

        StringBuilder sb = new StringBuilder();
        Map<Character, Character> alphabet = new HashMap<>(){{put(' ', ' ');}};
        int j = 97;

        for(int i = 0; i < key.length(); i++) {
            if (!alphabet.containsKey(key.charAt(i)))
            {
                alphabet.put(key.charAt(i), Character.toChars(j)[0]);
                j++;
            }
        }

        for(int i = 0; i < message.length(); i++)
            sb.append(alphabet.get(message.charAt(i)));

        return sb.toString();
    }
}
