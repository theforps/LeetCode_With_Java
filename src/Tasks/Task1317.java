package Tasks;

//https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers

public class Task1317 {
    public Task1317(int n)
    {
        for(var x : getNoZeroIntegers(n))
            System.out.printf("%d ",x);
    }

    public int[] getNoZeroIntegers(int n) {
        //2 <= n <= 10000

        int[] array = new int[2];

        OUTER:
        for(int i = 0; i < 10000; i++)
        {
            INNER:
            for(int j = 10000; j > 0; j--)
            {
                if(i + j == n && i != n && j != n)
                {
                    String str1 = Integer.toString(i);
                    String str2 = Integer.toString(j);

                    if(!str1.contains("0") && !str2.contains("0"))
                    {
                        array[0] = i;
                        array[1] = j;
                        break OUTER;
                    }
                }
            }
        }

        return array;
    }
}
