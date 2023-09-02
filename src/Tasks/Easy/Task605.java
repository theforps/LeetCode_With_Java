package Tasks.Easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/can-place-flowers

public class Task605 {
    public Task605(int[] flowerbed, int n)
    {
        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        List<Integer> list = new ArrayList<>();
        for(var x : flowerbed)
            list.add(x);
        list.add(0);

        for(int i = 0; i < list.size()-1; i+=2)
        {
            if(list.get(i) == 0 && list.get(i+1) == 0)
            {
                n--;
            }
            else if(list.get(i+1) == 1)
                i++;
        }
        return n <= 0;
    }
}
