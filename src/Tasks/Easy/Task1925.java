package Tasks.Easy;

//https://leetcode.com/problems/count-square-sum-triples

public class Task1925 {
    public Task1925(int n)
    {
        System.out.println(countTriples(n));
    }

    public int countTriples(int n) {

        int count = 0;

        for(int i = 1; i <= n; i++)
            for(int j = 1; j <= n; j++)
                for(int k = 1; k <= n; k++)
                {
                    if(i*i + j*j == k*k)
                        count++;
                }

        return count;
    }
}
