package Tasks.Easy;

//https://leetcode.com/problems/is-subsequence

public class Task392 {
    public Task392(String s, String t)
    {
        System.out.println(isSubsequence(s, t));
    }
    public boolean isSubsequence(String s, String t) {
        int temp = 0, result = 0;

        for(int i = 0; i < s.length(); i++)
            for(int j = temp; j < t.length(); j++)
                if(s.charAt(i) == t.charAt(j))
                {
                    result++;
                    temp = j + 1;
                    break;
                }

        return result == s.length();
    }
}
