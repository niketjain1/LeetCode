class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0, n = gas.length, start = 0;
        int totalSurplus = 0;
        for (int i = 0; i < n; i++) {
            totalSurplus += gas[i] - cost[i];
            sum += gas[i] - cost[i];

            if (totalSurplus < 0) {
                totalSurplus = 0;
                start = i + 1;
            }
        }
        return sum >= 0 ? start : -1;
    }
}