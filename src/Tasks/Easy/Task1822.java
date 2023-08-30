package Tasks.Easy;

//https://leetcode.com/problems/sign-of-the-product-of-an-array

public class Task1822 {
    public Task1822(int[] nums)
    {
        System.out.println(arraySign(nums));
    }

    public int arraySign(int[] nums) {
        double product = 1;

        for(var x : nums)
            product *= x;

        if(product > 0)
            return 1;
        else if(product < 0)
            return -1;

        return 0;
    }
}
