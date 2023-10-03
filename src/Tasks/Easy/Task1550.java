package Tasks.Easy;

//https://leetcode.com/problems/three-consecutive-odds

public class Task1550 {
    public Task1550(int[] arr)
    {
        System.out.println(threeConsecutiveOdds(arr));
    }

    public boolean threeConsecutiveOdds(int[] arr) {

        if(arr.length >= 3)

            for(int i = 2; i<arr.length; i++)

                if(arr[i] % 2 == 1 && arr[i-1] % 2 == 1 && arr[i-2] % 2 == 1)
                    return true;

        return false;
    }
}
