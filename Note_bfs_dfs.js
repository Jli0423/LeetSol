class node {
  constructor(left = null, right = null, val) {
    this.left = left;
    this.right = right;
    this.val = val;
  }
}

function dfs(node) {
  let stack = [node];
  let currNode;
  while (stack.length) {
    currNode = stack.pop();
    currNode.right && stack.push(currNode.right); // do right side first to go down LEFT branch first
    currNode.left && stack.push(currNode.left);
  }
}

function bfs(node) {
  let queue = [node];
  let currNode;
  while(queue.length) {
    currNode = queue.shift();
    currNode.left && queue.push(currNode.left);
    currNode.right && queue.push(currNode.right);
  }
}