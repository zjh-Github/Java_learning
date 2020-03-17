package LeetCode;

import LeetCode.PublicListNode.TreeNode;
public class DiameterOfBinaryTree {
    /*
    * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。
    * */
    /**
     * 已完成
     *
     */


    int result = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            if (root.left == null && root.right == null) {
                return 0;
            }
            TreeLength(root);

            return result;

        }
    }

    public int TreeLength(TreeNode node) {
        int left = 0;
        int right = 0;
        if (node.left != null) {
            left = TreeLength(node.left);
        }
        if (node.right != null) {
            right = TreeLength(node.right);
        }
        if (left + right > result) {
            result = left + right;
        }
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {

    }
}
