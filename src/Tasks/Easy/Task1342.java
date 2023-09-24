package Tasks.Easy;

//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero

public class Task1342 {
    public Task1342(int num)
    {
        System.out.println(numberOfSteps(num));
    }

    public int numberOfSteps(int num) {
        int count = 0;

        while(num != 0)
        {
            if(num%2==0)
                num /= 2;
            else
                num--;

            count++;
        }
        return count;
    }
}
