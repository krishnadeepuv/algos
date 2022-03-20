import java.util.*;

public class LevelOrderDFS {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null)
            return res;

        dfs(root, 0);
        return res;
    }

    public void dfs(TreeNode root, int level) {
        if (root == null)
            return;
        if (res.size() <= level) {
            List<Integer> temp = new ArrayList<Integer>();
            temp.add(root.val);
            res.add(temp);
        } else {
            res.get(level).add(root.val);
        }
        int new_level = level + 1;
        dfs(root.left, new_level);

        dfs(root.right, new_level);

    }

}
