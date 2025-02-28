class Solution {
    public int evalRPN(String[] str) {
        Stack<Integer> st=new Stack<>();
        for(String s:str)
        {
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"))
            {
                int a=st.pop();
                int b=st.pop();
                if(s.equals("+"))
                st.push(b+a);
                else if(s.equals("-"))
                st.push(b-a);
                else if(s.equals("*"))
                st.push(b*a);
                else
                st.push(b/a);
            }
            else
            {
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}