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
    public ListNode sortList(ListNode head) {
        //find middle divide into two halves and then merge
        if(head==null||head.next==null)
        return head;
        ListNode fast=head.next,slow=head;
        while(fast!=null  && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow;
        ListNode nextmid=mid.next;
        mid.next=null;

        ListNode l=sortList(head);
        ListNode r=sortList(nextmid);

        return merge(l,r);
    }
    //keep track of the end

    ListNode merge(ListNode l,ListNode r)
    {
        if(l==null)
        return r;
        if(r==null)
        return l;
        ListNode res=new ListNode(0);
        ListNode cur=res;
        while(l!=null && r!=null)
        {
            if(l.val<=r.val)
            {
                cur.next=l;
                l=l.next;
            }
            else
            {
                cur.next=r;
                r=r.next;
            }
            cur=cur.next;
        }
        if(l!=null)
        {
            cur.next=l;
        }
        if(r!=null)
        cur.next=r;
        return res.next;
    }
}