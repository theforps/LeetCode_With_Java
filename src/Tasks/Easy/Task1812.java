package Tasks.Easy;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/determine-color-of-a-chessboard-square

public class Task1812 {
    public Task1812(String coordinates)
    {
        System.out.println(squareIsWhite(coordinates));
    }

    public boolean squareIsWhite(String coordinates) {
        Map<Character, Integer> chars = new HashMap<>(){{
            put('a', 1);
            put('b', 2);
            put('c', 3);
            put('d', 4);
            put('e', 5);
            put('f', 6);
            put('g', 7);
            put('h', 8);
        }};

        int a = chars.get(coordinates.charAt(0));
        int b = Character.getNumericValue(coordinates.charAt(1));

        if(a == b || (a % 2 == 1 && b % 2 == 1) || (a % 2 == 0 && b % 2 == 0))
        {   return false;   }

        return true;
    }
}
