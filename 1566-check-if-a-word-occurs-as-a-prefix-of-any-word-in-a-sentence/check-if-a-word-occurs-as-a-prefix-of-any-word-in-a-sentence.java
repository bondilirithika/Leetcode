class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] str=sentence.split(" ");
        for(int i=0;i<str.length;i++)
        {
            if(str[i].contains(searchWord) && str[i].substring(0,searchWord.length()).equals(searchWord))
            return i+1;
        }
        return -1;
    }
}