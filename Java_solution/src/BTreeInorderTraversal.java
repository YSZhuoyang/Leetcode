import java.util.ArrayList;
import java.util.List;

/**
 * Created by oscar on 3/24/16.
 */
public class BTreeInorderTraversal
{

    // My fastest solution without using stack
    public List<Integer> inorderTraversal(TreeNode root)
    {
        ArrayList<Integer> result = new ArrayList<>();
        inorderTraversal(result, root);

        return result;
    }

    private void inorderTraversal(List<Integer> list, TreeNode node)
    {
        if (node != null)
        {
            inorderTraversal(list, node.left);
            list.add(node.val);
            inorderTraversal(list, node.right);
        }
    }

    // A non - recursive alternative using stack
    /*public List<Integer> inorderTraversal(TreeNode root)
    {
        List<Integer> result = new ArrayList<>();

        if (root == null)
        {
            return result;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;

        while (!stack.isEmpty() || p != null)
        {
            if (p != null)
            {
                stack.push(p);
                p = p.left;
            }
            else
            {
                p = stack.pop();
                result.add(p.val);
                p = p.right;
            }
        }

        return result;
    }*/
}
