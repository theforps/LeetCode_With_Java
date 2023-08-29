package Tasks;

import java.util.*;

//https://leetcode.com/problems/min-max-game

public class Task2293 {
    public Task2293(int[] nums)
    {
        System.out.println(minMaxGame(nums));
    }

    public int minMaxGame(int[] nums) {

        if(nums.length == 1)
            return nums[0];

        ArrayList<Integer> listOfMin = new ArrayList<>();
        ArrayList<Integer> temp;
        ArrayList<Integer> result;

        for (var x: nums) {
            listOfMin.add(x);
        }

        while (listOfMin.size() != 1) {
            result = new ArrayList<>();
            for (short i = 0; i < listOfMin.size()-1; i += 2) {

                temp = new ArrayList<>();
                temp.add(listOfMin.get(i));
                temp.add(listOfMin.get(i+1));

                if(i % 4 == 0)
                {
                    result.add(Collections.min(temp));
                }
                else {
                    result.add(Collections.max(temp));
                }
            }
            listOfMin = result;
        }
        return listOfMin.get(0);
    }
}
