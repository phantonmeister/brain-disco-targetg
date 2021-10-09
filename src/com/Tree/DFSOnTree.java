package Tree;

import java.util.Stack;

public class DFSOnTree {

    public static void dfs_iterative(TreeNode node){
        Stack<TreeNode> stack =  new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()){
            TreeNode popNode = stack.pop();
            if(popNode != null) {
                System.out.println(popNode.value);
                stack.push(popNode.rightNode);
                stack.push(popNode.leftNode);
            }
        }
    }

    public static void dfs_recursion(TreeNode node){
        if(node == null)
            return;
        System.out.println(node.value);
        dfs_recursion(node.leftNode);
        dfs_recursion(node.rightNode);
    }

    public static void main(String... args){
        TreeNode root = buildTree();
        dfs_iterative(root);
        dfs_recursion(root);
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
