package Tasks.Easy;

//https://leetcode.com/problems/check-if-strings-can-be-made-equal-with-operations-i

public class Task2839 {
    public Task2839(String s1, String s2)
    {
        System.out.println(canBeEqual(s1, s2));
    }

    public boolean canBeEqual(String s1, String s2) {
        char temp;
        char[] array = s2.toCharArray();
        for(int k = 0; k < array.length; k++) {
            for (int i = 1; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (j - i == 2) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }

                    s2 = "";
                    for(var x : array)
                        s2 += x;

                    if(s1.equals(s2))
                        return true;
                }
            }
        }
        return false;
    }
}
