package Tasks.Medium;

import java.util.Arrays;
import java.util.Random;

//https://leetcode.com/problems/find-unique-binary-string

public class Task1980 {
    public Task1980(String[] nums)
    {
        System.out.println(findDifferentBinaryString(nums));
    }

    public String findDifferentBinaryString(String[] nums) {

        String temp;
        Random rand = new Random();

        do
        {
            temp = "";
            for (int i = 0; i < nums[0].length(); i++)
                temp = temp.concat(String.valueOf(rand.nextInt(0, 2)));

        }
        while (Arrays.asList(nums).contains(temp));

        return temp;
    }
}
