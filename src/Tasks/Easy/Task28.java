package Tasks.Easy;

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string

public class Task28 {
    public Task28(String haystack, String needle)
    {
        System.out.println(strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);
    }
}
