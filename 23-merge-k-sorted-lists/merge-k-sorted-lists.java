/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        //everything pass to mergesort function taht divide sthe list and then call merge?
        //same code?
        //megre and then merge only
        if(lists.length==0)
        {
            return null;
        }
        ListNode m=lists[0];
        for(int i=1;i<lists.length;i++)
        {
            m=merge(m,lists[i]);
        }
        return m;
    }
    ListNode merge(ListNode a,ListNode b)
    {
        if(a==null)
        return b;
        if(b==null)
        return a;
        ListNode res=new ListNode(0);
        ListNode cur=res;
        while(a!=null && b!=null)
        {
            if(a.val<=b.val)
            {
                cur.next=a;
                a=a.next;
            }
            else
            {
                cur.next=b;
                b=b.next;
            }
            cur=cur.next;
        }
        if(a!=null)
        {
            cur.next=a;
        }
        if(b!=null)
        {
            cur.next=b;
        }
        return res.next;
    }
}