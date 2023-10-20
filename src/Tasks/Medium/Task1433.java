package Tasks.Medium;

import java.util.Arrays;

//https://leetcode.com/problems/check-if-a-string-can-break-another-string

public class Task1433 {
    public Task1433(String s1, String s2)
    {
        System.out.println(checkIfCanBreak(s1,s2));
    }

    public boolean checkIfCanBreak(String s1, String s2) {

        char[] array1 = s1.toCharArray(), array2 = s2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        int x = 0, y = 0, diff;

        for(int i = 0; i < array1.length; i++)
        {
            diff = array1[i] - array2[i];
            if (diff >= 0)
                x++;
            if (diff <= 0)
                y++;
        }
        return x == array1.length || y == array2.length;
    }
}
