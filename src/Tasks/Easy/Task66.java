package Tasks.Easy;

import java.util.Arrays;

//https://leetcode.com/problems/plus-one

public class Task66 {
    public Task66(int[] digits)
    {
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public int[] plusOne(int[] digits) {

        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            digits[i]++;

            if (digits[i] <= 9)
                return digits;

            digits[i] = 0;
        }

        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }
}
