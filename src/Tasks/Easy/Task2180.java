package Tasks.Easy;

//https://leetcode.com/problems/count-integers-with-even-digit-sum

public class Task2180 {
    public Task2180(int num)
    {
        System.out.println(countEven(num));
    }

    public int countEven(int num) {

        StringBuilder str;
        int count = 0;
        int temp;

        for (int i = 1; i <= num; i++) {

            str = new StringBuilder(String.valueOf(i));
            temp = 0;

            for (int j = 0; j < str.length(); j++)
                temp += Integer.parseInt(String.valueOf(str.charAt(j)));


            if(temp % 2 == 0)
                count++;
        }
        return count;
    }
}
