class Solution {
    int val;
    public int fib(int n) {
        if(n==0||n==1)
        return n;
        else{
            val=fib(n-1)+fib(n-2);
            return val;
        }
        
    }
}