class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        int c=0;
        for(int i:arr)
        {
            if(i==0)
            c++;
            set.add(i);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                if(c>1)
                return true;
                else 
                continue;
            }
            if(set.contains(arr[i]*2))
            {
                //System.out.println(arr[i]);
                return true;
            }
            
        }
        return false;
    }
}