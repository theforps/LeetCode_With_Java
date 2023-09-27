package Tasks.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/lucky-numbers-in-a-matrix

public class Task1380 {
    public Task1380(int[][] matrix)
    {
        System.out.println(luckyNumbers(matrix));
    }

    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int temp;

        for (int[] ints : matrix) {
            temp = Arrays.stream(ints).min().getAsInt();

            INNER:
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] == temp) {

                    for (int[] value : matrix) {
                        if (value[j] > temp)
                            break INNER;
                    }

                    result.add(temp);
                    break;
                }
            }
        }
        return result;
    }
}
