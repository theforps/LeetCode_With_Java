package Tasks.Easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/self-dividing-numbers

public class Task728 {
    public Task728(int left, int right)
    {
        System.out.println(selfDividingNumbers(left, right));
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> listOfNum = new ArrayList<>();
        int count = 0;

        for(int i = left; i < right + 1; i++)
        {
            char[] temp = Integer.toString(i).toCharArray();
            count = 0;

            for(var x : temp)
                if(i % Character.getNumericValue(x) == 0 && x != '0')
                    count++;

            if(count == temp.length)
                listOfNum.add(i);
        }
        return listOfNum;
    }
}
