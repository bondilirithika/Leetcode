class Solution {
    static int op=0;
    static int[][] memo=new int[500][500];
    public int minDistance(String word1, String word2) {
        for(int[] a:memo)
        {
            Arrays.fill(a,-1);
        }
        return solve(new StringBuilder(word1),word2,0,0);
    }
    int solve(StringBuilder w1,String w2,int i,int j)
    {
        if(i==w1.length())
        return w2.length()-j;
        if(j==w2.length())
        return w1.length()-i;
        if(memo[i][j]!=-1)
        return memo[i][j];
        if(w1.charAt(i)==w2.charAt(j))
        {
            return solve(w1,w2,i+1,j+1);
        }
        else
        {
            int op1=1+solve(w1,w2,i+1,j+1);
            int op2=1+solve(w1,w2,i+1,j);
            int op3=1+solve(w1,w2,i,j+1);
            op=Math.min(Math.min(op1,op2),op3);
            //return Math.min(m,op2);
        }
        return memo[i][j]=op;
    }
}