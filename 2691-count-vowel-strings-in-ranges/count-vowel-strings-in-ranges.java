class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] pref=new int[words.length];
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            if(isVowel(words[i]))
            {
                count++;
            }
            System.out.println(count);
            pref[i]=count;
        }
        int i=0;
        int[] ans=new int[queries.length];
        for(int[] arr:queries)
        {
            if(arr[0]==arr[1])
            {
                if(isVowel(words[arr[0]]))
                {
                    ans[i]=1;
                }
                else
                ans[i]=0;
            }
            else
            {
                if(arr[0]==0)
                {
                    ans[i]=pref[arr[1]];
                }
                else
                {
                    ans[i]=pref[arr[1]]-pref[arr[0]-1];
                }
            }
            i++;
        }
        return ans;
    }

    public boolean isVowel(String s)
    {
        HashSet<Character> h=new HashSet<>();
        h.add('a');
        h.add('e');
        h.add('i');
        h.add('o');
        h.add('u');
        if(!h.contains(s.charAt(0)))
        return false;
        if(!h.contains(s.charAt(s.length()-1)))
        return false;

        return true;
    }
}