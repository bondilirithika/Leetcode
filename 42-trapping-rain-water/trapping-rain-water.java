class Solution {
    public int trap(int[] height) {
        Stack<Integer> st=new Stack<>();
        int[] leftmax=new int[height.length];
        int[] rightmax=new int[height.length];
        for(int i=0;i<height.length;i++)
        {
            if(st.isEmpty())
            {
                st.push(height[i]);
            }
            else
            {
                while(!st.isEmpty() && st.peek()<height[i])
                {
                    st.pop();
                }
                if(st.isEmpty() || st.peek()<height[i])
                st.push(height[i]);
            }
            leftmax[i]=st.peek();
        }
        st=new Stack<>();
        for(int i=height.length-1;i>=0;i--)
        {
            if(st.isEmpty())
            {
                st.push(height[i]);
            }
            else
            {
                while(!st.isEmpty() && st.peek()<height[i])
                {
                    st.pop();
                }
                if(st.isEmpty() || st.peek()<height[i])
                st.push(height[i]);
            }
            rightmax[i]=st.peek();
        }
        int total=0;
        for(int i=0;i<height.length;i++)
        {
            if(height[i]<leftmax[i] && height[i]<rightmax[i])
            {
                total+=Math.min(leftmax[i],rightmax[i])-height[i];
            }
        }
        return total;
    }
}