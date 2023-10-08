package Tasks.Easy;

//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences

public class Task2114 {
    public Task2114(String[] sentences)
    {
        System.out.println(mostWordsFound(sentences));
    }

    public int mostWordsFound(String[] sentences) {
        String[] temp;
        int max = 0;

        for(var x : sentences)
        {
            temp = x.split(" ");
            if(temp.length > max)
                max = temp.length;
        }
        return max;
    }

}
