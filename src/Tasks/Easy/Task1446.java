package Tasks.Easy;

//https://leetcode.com/problems/consecutive-characters

public class Task1446 {
    public Task1446(String s)
    {
        System.out.println(maxPower(s));
    }

    public int maxPower(String s) {
        int count = 1;
        int max = 1;

        for(int i = 0; i < s.length()-1; i++)
        {
            if(s.charAt(i) == s.charAt(i+1))
            {
                count++;
                if(count > max)
                    max = count;
            }
            else {
                count = 1;
            }
        }
        return max;
    }
}
