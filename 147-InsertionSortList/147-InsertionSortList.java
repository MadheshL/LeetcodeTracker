// Last updated: 24/08/2026, 08:55:04
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode insertionSortList(ListNode head) {
13        ListNode curr = head,
14            pHead = new ListNode(0);
15            
16        while(curr != null){
17            ListNode c = pHead.next,
18                p = pHead;
19
20            while(c != null && c.val <= curr.val) {
21                p = p.next;
22                c = c.next; 
23            }
24
25            ListNode next = curr.next;
26            curr.next = c;
27            p.next = curr;
28            curr = next; 
29        }  
30        return pHead.next;
31    }
32}