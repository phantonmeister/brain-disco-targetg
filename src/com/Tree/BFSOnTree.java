package Tree;

import java.time.temporal.Temporal;
import java.util.LinkedList;
import java.util.Queue;

public class BFSOnTree {

    public static void bfs_iterative(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode s;
        while(!queue.isEmpty()){
            s = queue.poll();
            if(s != null) {
                System.out.println(s.value);
                queue.add(s.leftNode);
                queue.add(s.rightNode);
            }
        }
    }

    public static void main(String... args){
        TreeNode root = buildTree();
        bfs_iterative(root);
    }

    public static TreeNode  buildTree(){
        TreeNode node = new TreeNode(3);
        TreeNode level2Left = new TreeNode(7);
        TreeNode level2Right = new TreeNode(8);
        node.leftNode = level2Left;
        node.rightNode= level2Right;

        TreeNode level2LeftMiddle = new TreeNode(11);
        level2LeftMiddle.leftNode =  new TreeNode(9);

        TreeNode level1Left = new TreeNode(6);
        level1Left.leftNode = node;
        level1Left.rightNode = level2LeftMiddle;

        TreeNode level1Right = new TreeNode(2);
        level1Right.leftNode = new TreeNode(10);
        level1Right.rightNode = new TreeNode(4);

        TreeNode root = new TreeNode(5);
        root.leftNode = level1Left;
        root.rightNode = level1Right;

        return root;
    }
}
