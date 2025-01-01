class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<ArrayList<Integer>,ArrayList<String>> map=new HashMap<>();
        for(String s:strs)
        {
            int[] arr=new int[26];
            for(char c:s.toCharArray())
            {
                arr[c-'a']+=1;
            }
            ArrayList<Integer> m=new ArrayList<>();
            for(int i:arr)
            {
                m.add(i);
            }
            map.put(m,map.getOrDefault(m,new ArrayList<String>()));
            ArrayList<String> cur=map.get(m);
            cur.add(s);
            map.put(m,cur);
        }
        List<List<String>> ans=new ArrayList<List<String>>();
        for(ArrayList<Integer> n:map.keySet())
        {
            ans.add(map.get(n));
        }
        return ans;
    }
}