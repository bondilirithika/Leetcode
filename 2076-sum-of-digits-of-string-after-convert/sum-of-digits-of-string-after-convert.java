class Solution {
    public int getLucky(String s, int ki) {
        //int String str="";
        int k=0;
        for(char c:s.toCharArray())
        {
            int temp=(c-'a')+1;
            while(temp>0)
            {
                k+=temp%10;
                temp=temp/10;
            }
        }
        while(ki-1>0)
        {
            int sum=0;
            while(k>0)
            {
                sum+=k%10;
                k=k/10;
            }
            k=sum;
            ki--;
        }
        return k;
    }
}