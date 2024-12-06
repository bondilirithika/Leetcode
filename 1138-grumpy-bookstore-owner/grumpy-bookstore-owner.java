class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum=0;
        for(int i=0;i<grumpy.length;i++)
        {
            if(grumpy[i]==0)
            {
                sum+=customers[i];
                customers[i]*=grumpy[i];
            }
        }
        int e=0,cur=0;
        for(int i=0;i<minutes;i++)
        {
            cur+=customers[i];
        }
        e=Math.max(e,cur);
        for(int i=minutes;i<=customers.length-1;i++)
        {
            cur=cur-customers[i-minutes]+customers[i];
            e=Math.max(e,cur);
        }
        return sum+e;

    }
}