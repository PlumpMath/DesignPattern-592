package HeadFirst;

import java.util.Scanner;

/**
 * @author NikoBelic
 * @create 9/8/16 22:50
 */
public class TreeTest
{
    public static TreeNode buildTree(Integer[] arrays)
    {
        TreeNode[] nodes = new TreeNode[arrays.length];
        for ( int i = 0 ; i < arrays.length ; i++)
        {
            TreeNode node = null;
            if (arrays[i] != null)
            {
                node = new TreeNode(arrays[i]);
            }
            nodes[i] = node;
        }
        /*
                        0
                    1        2
                 3    4    5    6
               7   8 9 10
         */
        for (int i = 0; i < nodes.length; i++)
        {
            try
            {
                if (nodes[i] != null)
                {
                    nodes[i].left = nodes[2 * i + 1];
                    nodes[i].right = nodes[2 * i + 2];
                }
            }catch (Exception e)
            {
                break;
            }
        }
        return nodes[0];
    }

    public static void main(String[] args)
    {
        TreeNode root =buildTree(new Integer[]{0,1,null,3,4});
        System.out.println(root);
    }
}

class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val)
    {
        this.val = val;
    }

    @Override
    public String toString()
    {
        return "[" + val + this.left + this.right + "]";
    }
}
