package Tasks.Easy;

//https://leetcode.com/problems/water-bottles

public class Task1518 {
    public Task1518(int numBottles, int numExchange)
    {
        System.out.println(numWaterBottles(numBottles, numExchange));
    }

    public int numWaterBottles(int numBottles, int numExchange) {

        int count = numBottles;

        while (numBottles >= numExchange)
        {
            count += numBottles / numExchange;
            numBottles = numBottles % numExchange + numBottles / numExchange;
        }

        return count;
    }
}
