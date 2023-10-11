package Tasks.Medium;

//https://leetcode.com/problems/longest-substring-without-repeating-characters

public class Task3 {
    public Task3(String s)
    {
        System.out.println(lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {

        if(s.equals(" "))
            return 1;

        StringBuilder temp;
        int max = 0;

        for(int j = 0; j < s.length(); j++) {

            temp = new StringBuilder();

            for (int i = j; i < s.length(); i++) {

                temp.append(String.valueOf(s.charAt(i)));

                if (i + 1 < s.length()
                        && temp
                        .toString()
                        .contains(String.valueOf(s.charAt(i + 1))))
                {
                    break;
                }

            }
            max = Math.max(temp.length(), max);
        }
        return max;
    }
}
