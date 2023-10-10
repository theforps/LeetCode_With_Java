package Tasks.Easy;

//https://leetcode.com/problems/count-operations-to-obtain-zero

public class Task2169 {
    public Task2169(int num1, int num2)
    {
        System.out.println(countOperations(num1, num2));
    }

    public int countOperations(int num1, int num2) {

        int count = 0;

        while(num1 > 0 && num2 > 0)
        {
            if(num1 > num2)
                num1 -= num2;
            else if(num2 > num1)
                num2 -= num1;
            else
            {
                count++;
                break;
            }
            count++;
        }
        return count;
    }
}
