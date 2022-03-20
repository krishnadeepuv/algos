import java.util.Arrays;

public class ConstructBinaryTree {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0)
            return null;

        int r = preorder[0];
        int idx = -1;

        TreeNode root = new TreeNode(r);
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == r)
                idx = i;
        }

        int[] inLeft = Arrays.copyOfRange(inorder, 0, idx);
        int[] inRight = Arrays.copyOfRange(inorder, idx + 1, inorder.length);
        int[] preleft = Arrays.copyOfRange(preorder, 1, idx + 1);
        int[] preRight = Arrays.copyOfRange(preorder, idx + 1, preorder.length);

        root.left = buildTree(preleft, inLeft);
        root.right = buildTree(preRight, inRight);
        return root;
    }

}
