package Tasks.Easy;

//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent

public class Task1662 {
    public Task1662(String[] word1, String[] word2)
    {
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String str1 = "", str2 = "";

        for(var x : word1)
            str1 = str1.concat(x);

        for(var x : word2)
            str2 = str2.concat(x);

        return str1.equals(str2);
    }
}
