class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs)
        {
            int[] arr=new int[26];
            for(int i=0;i<str.length();i++)
            {
                arr[str.charAt(i)-'a']++;
            }
            String s=Arrays.toString(arr);
            map.putIfAbsent(s,new ArrayList<String>());
            map.get(s).add(str);
        }
        return new ArrayList<>(map.values());
    }
}