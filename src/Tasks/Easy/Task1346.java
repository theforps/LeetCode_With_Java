package Tasks.Easy;

//https://leetcode.com/problems/check-if-n-and-its-double-exist

public class Task1346 {
    public Task1346(int[] arr)
    {
        System.out.println(checkIfExist(arr));
    }

    public boolean checkIfExist(int[] arr) {

        for(int i =0; i<arr.length; i++)
            for(int j = 0; j<arr.length ;j++)
                if(i != j && arr[i] == 2 * arr[j])
                    return true;

        return false;
    }
}
