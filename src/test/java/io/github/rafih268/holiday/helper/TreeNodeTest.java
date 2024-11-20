package io.github.rafih268.holiday.helper;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TreeNodeTest {

  @Test
  void testLeafNodeCreation() {
    TreeNode leaf = new TreeNode("Tenerife");
    assertNotNull(leaf);
    assertEquals("Beach", leaf.getValue());
    assertNull(leaf.getLeft());
    assertNull(leaf.getRight());
  }
  
}
