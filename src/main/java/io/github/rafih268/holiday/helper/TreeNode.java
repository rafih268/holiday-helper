package io.github.rafih268.holiday.helper;

public class TreeNode {
  String value;
  TreeNode left;
  TreeNode right;

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
}
