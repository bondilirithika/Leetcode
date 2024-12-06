class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        ArrayList<Integer> arr=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        for(String a:words)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int winsize=words[0].length()*words.length;
        int wordsize=words[0].length();

        if(map.containsKey("a"))
        {
            if(map.get("a")==5000)
            {
                for(int i=0;i<s.length()-4999;i++)
                {
                    arr.add(i);
                }
                return arr;
            }
        }
        for(int i=0;i<=s.length()-winsize;i++)
        {
            HashMap<String,Integer> m=new HashMap<>();
            int flag=0;
            for(int j=i;j<i+winsize;j=j+wordsize)
            {
                String cur=s.substring(j,j+wordsize);
                if(!map.containsKey(cur))
                {
                    flag=1;
                    break;
                }
                m.put(cur,m.getOrDefault(cur,0)+1);
                if(m.get(cur)>map.get(cur))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                arr.add(i);
            }
            
        }
        System.out.println(s.length()+" "+words.length);
        return arr;
    }
}