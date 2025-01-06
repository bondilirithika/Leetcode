class Solution {
    public int[] minOperations(String boxes) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<boxes.length();i++)
        {
            if(boxes.charAt(i)=='1')
            {
                set.add(i);
            }
        }
        int[] ans=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++)
        {
            int op=0;
            for(int j:set)
            {
                op+=Math.abs(i-j);
            }
            ans[i]=op;
        }
        return ans;
    }
}