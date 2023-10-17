package Tasks.Medium;

//https://leetcode.com/problems/minimum-operations-to-make-array-equal

public class Task1551 {
    public Task1551(int n)
    {
        System.out.println(minOperations(n));
    }

    public int minOperations(int n) {

        int temp, count = 0;

        for (int i = 0; i < n/2; i++) {

            temp = (2 * i) + 1;

            count += n - temp;
        }

        return count;
    }
}
