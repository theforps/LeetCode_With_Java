package Tasks.Easy;

public class Task58 {
    public Task58(String s)
    {
        System.out.println(lengthOfLastWord(s));
    }

    public int lengthOfLastWord(String s) {

        String[] array = s.split(" ");

        return array[array.length-1].length();
    }
}
