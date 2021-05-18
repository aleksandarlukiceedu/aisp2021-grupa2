import tree.Tree;
import tree.TreeNode;

public class Program {
    public static void main(String[] args) {
        TreeNode<String> treeNodeA = new TreeNode<>("A");
        TreeNode<String> treeNodeB = new TreeNode<>("B", treeNodeA);
        TreeNode<String> treeNodeC = new TreeNode<>("C", treeNodeA);
        TreeNode<String> treeNodeD = new TreeNode<>("D", treeNodeA);
        TreeNode<String> treeNodeE = new TreeNode<>("E", treeNodeB);
        TreeNode<String> treeNodeF = new TreeNode<>("F", treeNodeB);
        TreeNode<String> treeNodeG = new TreeNode<>("G", treeNodeC);
        TreeNode<String> treeNodeH = new TreeNode<>("H", treeNodeC);

        Tree<String> tree = new Tree<>(treeNodeA);

        tree.processPreorder();
        System.out.println("-------------");
        tree.processPostorder();
        System.out.println("-------------");
        tree.processBF();
    }
}
