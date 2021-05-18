package tree;

import java.util.ArrayList;

public class TreeNode<T> {
    private TreeNode<T> parent;
    private ArrayList<TreeNode<T>> children;
    private T element;

    public TreeNode(){
        this.children = new ArrayList<>();
    }

    public TreeNode(T element){
        this();
        this.element = element;
    }

    public TreeNode(T element, TreeNode<T> parent){
        this();
        this.element = element;
        this.parent = parent;
        this.parent.addChild(this);
    }

    public void addChild(TreeNode<T> child){
        this.children.add(child);
        child.setParent(this);
    }

    public boolean isRoot(){
        return this.parent == null;
    }

    public boolean isLeaf(){
        return this.children.isEmpty();
    }

    public TreeNode<T> getParent() {
        return parent;
    }

    public void setParent(TreeNode<T> parent) {
        this.parent = parent;
    }

    public ArrayList<TreeNode<T>> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<TreeNode<T>> children) {
        this.children = children;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}
