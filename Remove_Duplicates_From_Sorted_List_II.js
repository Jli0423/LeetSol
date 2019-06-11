/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var deleteDuplicates = function(head) {
  let dups = new Map();
  let node = head;
  while(node) {
      if (dups.has(node.val)) {
          dups.set(node.val, dups.get(node.val) + 1);
      } else {
          dups.set(node.val, 1);
      }
      node = node.next; 
  }
  node = head;
  let prev = null;
  let temp = null;
  while(node) {
      if (dups.get(node.val) > 1) {
          if(prev) {
              prev.next = node.next;
              temp = node.next;
              node.next = null;
              node = temp;
          } else {
              temp = node.next;
              node.next = null;
              node = temp;
              head = temp;
          }
      } else {
          prev = node;
          node = node.next;
      }
  }
  return head;
};