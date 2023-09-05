package Tasks.Easy;

//https://leetcode.com/problems/rotate-string

public class Task796 {
    public Task796(String s, String goal)
    {
        System.out.println(rotateString(s, goal));
    }

    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < goal.length(); i++)
        {
            sb.insert(0, sb.charAt(sb.length()-1));
            sb.deleteCharAt(sb.length()-1);

            if(sb.toString().equals(goal))
                return true;
        }
        return false;
    }
}
