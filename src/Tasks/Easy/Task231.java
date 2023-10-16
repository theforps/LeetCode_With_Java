package Tasks.Easy;

//https://leetcode.com/problems/power-of-two

public class Task231 {
    public Task231(int n)
    {
        System.out.println(isPowerOfTwo(n));
    }

    public boolean isPowerOfTwo(int n) {

        double result = 0;
        int i = 0;

        while(result < n)
        {
            result = Math.pow(2, i);

            if(result == n)
                return true;

            i++;
        }
        return false;
    }
}
