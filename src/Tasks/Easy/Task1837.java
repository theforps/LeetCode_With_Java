package Tasks.Easy;

//https://leetcode.com/problems/sum-of-digits-in-base-k

public class Task1837 {
    public Task1837(int n, int k)
    {
        System.out.println(sumBase(n, k));
    }

    public int sumBase(int n, int k) {

        int sum = 0;
        StringBuilder newNumber = new StringBuilder();

        while(n > 0)
        {
            if(n % k == 0)
                n /= k;
            else {
                newNumber.append(n % k);
                n -= n % k;
            }
        }

        for(int i = 0; i < newNumber.length(); i++)
            sum += Character.getNumericValue(newNumber.charAt(i));

        return sum;
    }
}
