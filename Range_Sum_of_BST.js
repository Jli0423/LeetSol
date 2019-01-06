/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} L
 * @param {number} R
 * @return {number}
 */
let sum = 0;

function bstSearch(root, L, R) {
    if (root.val <= R && root.val >= L) {
        sum += root.val;
    }
    
    if (root.left != null) {
        bstSearch(root.left, L, R);
    }
    
    if (root.right != null) {
        bstSearch(root.right, L, R);
    }
}

var rangeSumBST = function(root, L, R) {
    if (root.left === null && root.right === null) {
        return 0;
    }
    
    bstSearch(root, L, R);
    return sum;
};

