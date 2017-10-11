/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1 = stacked(stack1, l1);
        stack2 = stacked(stack2, l2);
        Stack<Integer> ans = new Stack<>();
        boolean overflow = false;
        while(!stack1.empty() && !stack2.empty()){
            int total = stack1.pop() + stack2.pop();
            if(overflow){
                total ++;
                overflow = false;
            }
            if(total > 9){
                total = total % 10;
                overflow = true;
            }
            ans.push(total);
        }
        while(!stack1.empty()){
            int total = stack1.pop();
            if(overflow){
                total ++;
                overflow = false;
            }
            if(total > 9){
                total = total % 10;
                overflow = true;
            }
            ans.push(total);
        }
        while(!stack2.empty()){
            int total = stack2.pop();
            if(overflow){
                total ++;
                overflow = false;
            }
            if(total > 9){
                total = total % 10;
                overflow = true;
            }
            ans.push(total);
        }
        if(stack1.empty() && stack2.empty() && overflow){
            ans.push(1);
        }
        System.out.println("Stack: " + ans);
        ListNode answer = new ListNode(ans.pop());
        ListNode head = answer;
        while(!ans.empty()){
            answer.next = new ListNode(ans.pop());
            answer = answer.next;
        }
        return head;
    }

    public Stack<Integer> stacked(Stack<Integer> stack, ListNode node){
        if(node != null){
            stack.push(node.val);
        }
        if(node.next != null) {
            stack = stacked(stack, node.next);
        }
        return stack;
    }
}
