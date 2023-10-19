package Tasks.Medium;

//https://leetcode.com/problems/remove-all-occurrences-of-a-substring

public class Task1910 {
    public Task1910(String s, String part)
    {
        System.out.println(removeOccurrences(s, part));
    }

    public String removeOccurrences(String s, String part) {

        while(s.contains(part))
            s = s.replaceFirst(part, "");

        return s;
    }
}
