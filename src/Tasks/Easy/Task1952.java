package Tasks.Easy;

//https://leetcode.com/problems/three-divisors

public class Task1952 {
    public Task1952(int n)
    {
        System.out.println(isThree(n));
    }

    public boolean isThree(int n) {

        int count = 0;

        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
                count++;
        }

        return count == 3;
    }
}
