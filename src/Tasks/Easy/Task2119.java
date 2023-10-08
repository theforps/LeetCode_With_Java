package Tasks.Easy;

//https://leetcode.com/problems/a-number-after-a-double-reversal

public class Task2119 {
    public Task2119(int num)
    {
        System.out.println(isSameAfterReversals(num));
    }

    public boolean isSameAfterReversals(int num) {

        StringBuilder sb = new StringBuilder(String.valueOf(num));

        int reverseNum = Integer.parseInt(sb.reverse().toString());

        sb = new StringBuilder(String.valueOf(reverseNum)).reverse();

        return num == Integer.parseInt(sb.toString());
    }
}
