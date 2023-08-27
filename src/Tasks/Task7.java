package Tasks;

//https://leetcode.com/problems/reverse-integer

public class Task7 {
    public Task7(int x)
    {
        System.out.println(reverse(x));
    }

    public int reverse(int x) {

        boolean badNum = false;
        String str = Integer.toString(x);
        StringBuilder sb = new StringBuilder(str);

        if(sb.charAt(0) == '-')
        {
            badNum = true;
            sb.deleteCharAt(0);
        }

        sb.reverse();

        if(badNum)
            sb.insert(0, "-");

        double result = Double.valueOf(sb.toString());

        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
            result = 0;

        return (int)result;
    }
}
