package Tasks.Easy;

//https://leetcode.com/problems/merge-strings-alternately

public class Task1768 {
    public Task1768(String word1, String word2){
        System.out.println(mergeAlternately(word1,word2));
    }

    public String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();

        int count = 0;

        while (count < word1.length() || count < word2.length())
        {
            if(count < word1.length())
            {
                sb.append(word1.charAt(count));
            }
            if(count < word2.length())
            {
                sb.append(word2.charAt(count));
            }

            count++;
        }
        return sb.toString();
    }
}
