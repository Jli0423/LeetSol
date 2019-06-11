/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} m
 * @param {number} n
 * @return {ListNode}
 */
var reverseBetween = function(head, m, n) {
  if (!head || !head.next) {
      return head;
  }   
  let start = head;
  let end;
  let count = 0;
  while (count < n) {
      start = start.next;
      count ++;
  }
  end = start;
  while (count < n) {
      end = end.next;
      count++;
  }
  
  let next = head.next;
  head.next = null;
  return recurseReverse(head, next);
};

var recurseReverse = function(curr, next) {
  if(!next) {
      return curr;
  }
  let temp = next.next;
  next.next = curr;
  curr = next;
  next = temp;
  return recurseReverse(curr, next);
}