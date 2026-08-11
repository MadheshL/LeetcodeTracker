// Last updated: 11/08/2026, 11:42:11
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode result=new ListNode();
    ListNode head=result;
    int carrie=0;
        while(l1!=null || l2!=null || carrie!=0){
         int sum=carrie;
         if(l1!=null){
            sum+=l1.val;
             l1=l1.next;
         }
         if(l2!=null){
            sum+=l2.val;
            l2=l2.next;
         }
            carrie=sum/10;
            int digit=sum%10;
           head.next=new ListNode(digit);
          head=head.next;
         
        }
        return result.next;
    }
}
 
