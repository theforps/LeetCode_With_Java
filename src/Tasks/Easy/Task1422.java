package Tasks.Easy;

//https://leetcode.com/problems/maximum-score-after-splitting-a-string

public class Task1422 {
    public Task1422(String s)
    {
        System.out.println(maxScore(s));
    }

    public int maxScore(String s) {
        int max = 0, temp;

        for(int i = 1; i < s.length(); i++)
        {
            temp =  (int)(s.substring(0, i)
                    .chars()
                    .filter(x -> x == '0')
                    .count()
                    + s.substring(i, s.length())
                    .chars()
                    .filter(x -> x == '1')
                    .count());

            if(max < temp)
                max = temp;
        }

        return max;
    }
}
