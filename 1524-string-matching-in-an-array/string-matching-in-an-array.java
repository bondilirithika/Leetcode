class Solution {
    public List<String> stringMatching(String[] words) {
        //sort it in the orer of length ie.,like from less to high an dthen compare
        Arrays.sort(words,(a,b)->a.length()-b.length());
        List<String> ans=new ArrayList<String>();
        for(int i=0;i<words.length-1;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(words[j].contains(words[i]))
                {
                    ans.add(words[i]);
                    break;
                }
            }
        }
        return ans;
    }
}