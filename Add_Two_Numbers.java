/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// Final Attempt: fuck recursion
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode extra = ans;
        int overflow = 0;
        while(l1 != null || l2 != null){
            if(l1 != null){
                ans.val += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                ans.val += l2.val;
                l2 = l2.next;
            }
            if(overflow == 1){
                ans.val ++;
                overflow = 0;
            }
            if(ans.val > 9){
                overflow = 1;
                ans.val = Math.abs(ans.val%10);
            }
            if(l1 == null && l2 == null){
                break;
            }
            ans.next = new ListNode(0);
            ans = ans.next;
        }
        if(overflow == 1){
            ans.next = new ListNode(1);
        }
        return extra;
    }
}
    
 
// Second Attempt: Refined Solution STILL DOESN'T WORK
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addVal(l1, l2, 0);
    }
    
    
    public ListNode addVal(ListNode l1, ListNode l2, int shift){
        ListNode ans = new ListNode(-1);
        if(l1 == null && l2 == null){
            if(shift == 1){
                ans.val = 1;
                return ans;
            }
            return null;
        }
        else if(l1 == null){
            ans.val = l2.val + shift;
        }
        else if(l2 == null){
            ans.val = l1.val + shift;
        }
        else{
            ans.val = Math.abs((l1.val + l2.val + shift)%10);
            if(l1.val + l2.val + shift > 9){
                ans.next = addVal(l1.next, l2.next, 1);
            }else{
                ans.next = addVal(l1.next, l2.next, 0);
            }
        }
    return ans;
    }
}

// First Attempt - not fully working :\
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addVal(l1, l2, 0);
    }
    
    
    public ListNode addVal(ListNode l1, ListNode l2, int shift){
        ListNode ans = new ListNode(-1);
        if(shift == 1){
            if(l1.val + l2.val + 1> 9){
                ans.val = l1.val + l2.val - 10 + 1;
                if(l1.next == null && l2.next == null){
                    return ans;
                }
                ans.next = addVal(l1.next, l2.next, 1);
            }
            else{
                ans.val = l1.val + l2.val + 1;
                if(l1.next == null && l2.next == null){
                    return ans;
                }
                ans.next = addVal(l1.next, l2.next, 0);
            }
        }
        else{
            if(l1.val + l2.val > 9){
                ans.val = l1.val + l2.val - 10;
                if(l1.next == null && l2.next == null){
                    return ans;
                }
                ans.next = addVal(l1.next, l2.next, 1);
            }
            else{
                ans.val = l1.val + l2.val;
                if(l1.next == null && l2.next == null){
                    return ans;
                }
                ans.next = addVal(l1.next, l2.next, 0);
            }
        }
    return ans;
    }
}