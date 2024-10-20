class Solution {
    public boolean parseBoolExpr(String e) {
        //im thinking stack
        Stack<Character> st=new Stack<>();
        boolean res=false;
        //char op='.';
        ArrayList<Boolean> arr=new ArrayList<>();
        for(char c:e.toCharArray())
        {
            if(c==')')
            {
                int count=0;
                while(st.peek()!='(')
                {
                    boolean val=false;
                    if(st.pop()=='t')
                    val=true;
                    else
                    val=false;
                    arr.add(val);
                    count++;
                }
                st.pop();
                res=arr.get(0);
                char op=st.pop();
                if (op == '!') {
                    res = !arr.get(0);
                } else if (op == '&') {
                   
                    res = true;  // Initialize to true
                    for (boolean b : arr) {
                        res = res && b;
                    }
                } else if (op == '|') {
                    res = false;  // Initialize to false
                    for (boolean b : arr) {
                        res = res || b;
                    }
                }
                arr.clear();
                st.push(res==true? 't':'f');
                
            }

            else if(c!=',')
            {
                st.push(c);
            }
            
        }

        return st.pop()=='t';
    }
}