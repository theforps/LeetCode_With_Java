package Tasks.Easy;

//https://leetcode.com/problems/find-first-palindromic-string-in-the-array

public class Task2108 {
    public Task2108(String[] words)
    {
        System.out.println(firstPalindrome(words));
    }

    public String firstPalindrome(String[] words) {
        for(var x : words)
        {
            StringBuilder sb = new StringBuilder(x);
            if(x.contentEquals(sb.reverse()))
                return x;

        }
        return "";
    }
}
