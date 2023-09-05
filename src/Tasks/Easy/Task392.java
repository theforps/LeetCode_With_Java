package Tasks.Easy;

import java.util.Arrays;

public class Task392 {
    public Task392(String s, String t)
    {
        System.out.println(isSubsequence(s, t));
    }

    public boolean isSubsequence(String s, String t) {

        char[] arr1 = t.toCharArray();
        String result = "";

        for(int i = 0; i < arr1.length; i++)
        {
            if(s.contains(Character.toString(arr1[i])))
            {
                result += arr1[i];
            }
        }

        return s.equals(result);
    }
}
