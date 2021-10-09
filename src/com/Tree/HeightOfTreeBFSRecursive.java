package Tree;

public class HeightOfTreeBFSRecursive {

    public static int heightOfATree(TreeNode root){
        //This is a recursive function. Alternative you can do a level order traversal and count levels.
        if(root == null)
            return 0;
        return 1+Math.max(heightOfATree(root.leftNode), heightOfATree(root.rightNode));
    }

    public static void main(String... args){
        TreeNode root = buildTree();
        System.out.println(heightOfATree(root));
    }
    public static void postOrderTraversal(TreeNode root){
        if(root == null)
            return;
        postOrderTraversal(root.leftNode);
        postOrderTraversal(root.rightNode);
        System.out.println(root.value);
    }
    public static TreeNode buildTree(){
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
