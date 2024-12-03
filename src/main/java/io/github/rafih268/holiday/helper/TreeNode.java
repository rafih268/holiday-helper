package io.github.rafih268.holiday.helper;

public class TreeNode {
  private String value;
  private TreeNode left;
  private TreeNode right;

  // Leaf node
  public TreeNode(String value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }

  // Node with children
  public TreeNode(String value, TreeNode left, TreeNode right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }

  public String getValue() {
    return value;
  }

  public TreeNode getLeft() {
    return left;
  }

  public TreeNode getRight() {
    return right;
  }
  
  public void setValue(String value) {
    this.value = value;
  }

  public void setLeft(TreeNode left) {
    this.left = left;
  }

  public void setRight(TreeNode right) {
    this.right = right;
  }

  public boolean isLeaf() {
    return this.left == null && this.right == null;
  }
}
