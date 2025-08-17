class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        //greedy approach
        int totgas=0,totcost=0,tank=0,start=0;
        for(int i=0;i<gas.length;i++)
        {
            totgas+=gas[i];
            totcost+=cost[i];
            tank+=gas[i]-cost[i];
            if(tank<0)
            {
                tank=0;
                start=i+1;
            }
        }
        return totcost>totgas ?-1 : start;
    }
}