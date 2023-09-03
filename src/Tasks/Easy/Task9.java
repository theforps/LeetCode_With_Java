package Tasks.Easy;

//https://leetcode.com/problems/palindrome-number

public class Task9 {
    public Task9(int x)
    {
        System.out.println(isPalindrome(x));
    }

    public boolean isPalindrome(int x) {

        return Integer.toString(x).contentEquals(new StringBuilder(Integer.toString(x)).reverse());
    }
}
