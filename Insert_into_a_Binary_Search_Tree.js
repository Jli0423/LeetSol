/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} val
 * @return {TreeNode}
 */
var insertIntoBST = function(root, val) {
    if (root === null) {
        return new TreeNode(val);
    }
    return insertion(root, val, null, root);
};

var insertion = function(node, val, prevNode, root) {
    if (node === null) {
        if (prevNode.val > val) {
            node = new TreeNode(val);
            prevNode.left = node;
        } else {
            node = new TreeNode(val);
            prevNode.right = node;
        }
        return root;
    }
    
    if (val < node.val) {
        return insertion(node.left, val, node, root);
    } else {
        return insertion(node.right, val, node, root);
    }
}