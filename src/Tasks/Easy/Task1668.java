package Tasks.Easy;

//https://leetcode.com/problems/maximum-repeating-substring

public class Task1668 {
    public Task1668(String sequence, String word)
    {
        System.out.println(maxRepeating(sequence, word));
    }

    public int maxRepeating(String sequence, String word) {
        int count = 0;
        String temp = word;

        while(sequence.contains(temp))
        {
            temp += word;
            count++;
        }

        return count;
    }
}
