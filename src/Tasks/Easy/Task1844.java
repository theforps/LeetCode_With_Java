package Tasks.Easy;

//https://leetcode.com/problems/replace-all-digits-with-characters

public class Task1844 {
    public Task1844(String s)
    {
        System.out.println(replaceDigits(s));
    }

    public String replaceDigits(String s) {

        StringBuilder result = new StringBuilder();
        int number, diff;

        for(int i = 0; i < s.length(); i++)
        {
            try
            {
                diff = Integer.parseInt(String.valueOf(s.charAt(i)));
                number = Character.hashCode(result.charAt(i-1)) + diff;
                result.append(Character.toChars(number)[0]);
            }
            catch (Exception e) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
