package io.github.rafih268.holiday.helper;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TreeNodeTest {
  @Test
  void testLeafNodeCreation() {
    TreeNode leaf = new TreeNode("Tenerife");
    assertNotNull(leaf);
    assertEquals("Tenerife", leaf.getValue());
    assertNull(leaf.getLeft());
    assertNull(leaf.getRight());
  }

  @Test
  void testIsLeaf() {
    TreeNode leaf = new TreeNode("Goa");
    assertTrue(leaf.isLeaf(), "Leaf node should return true for isLeaf()");

    TreeNode nonLeaf = new TreeNode("Do you like cold weather?",
                                    new TreeNode("Switzerland"),
                                    new TreeNode("Goa"));
    
    assertFalse(nonLeaf.isLeaf(), 
        "Non-leaf node should return false for isLeaf()");
  }
}
