import java.util.*;

public class LevelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;

        Queue<TreeNode> helper = new LinkedList<>();
        helper.add(root);
        int size = 1;
        while (!helper.isEmpty()) {
            size = helper.size();
            List<Integer> part = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = helper.poll();
                part.add(temp.val);
                if (temp.left != null)
                    helper.add(temp.left);
                if (temp.right != null)
                    helper.add(temp.right);
            }
            res.add(part);
        }
        return res;
    }

}
