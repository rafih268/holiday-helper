package io.github.rafih268.holiday.helper;

import java.util.Objects;
import java.util.Scanner;

public class HolidaySuggester {
  private static Scanner input = new Scanner(System.in);
  private static TreeNode cursor = null;
  private final static String CHOICE = "[y/n]";
  private static TreeNode questionTree = new TreeNode("Do you like cold weather?"+CHOICE,
                                          new TreeNode("Are you a keen hiker?"+CHOICE,
                                            new TreeNode("The scottish highlands"),
                                            new TreeNode("Moscow")), 
                                          new TreeNode("Goa"));

  public static void main(String[] args) {
    System.out.println("Welcome to the Holiday Destination Suggester");

    cursor = questionTree;
    while (Objects.nonNull(cursor)) {
      System.out.println(cursor.getValue());
      String answer = input.nextLine();

      if (checkAnswer(answer)) {
        cursor = cursor.getLeft();
      } else {
        cursor = cursor.getRight();
      }

      if (cursor.isLeaf()) {
        System.out.println(cursor.getValue());
        generateQuestion(cursor);
        restartSuggester();
      }
    }
  }

  private static void generateQuestion(TreeNode leafNode) {
    System.out.println("Is this satisfactory?"+CHOICE);
    String answer = input.nextLine();

    String newQuestion;
    String newLocation;
    if (!checkAnswer(answer)) {
      System.out.println("What would you prefer instead?");
      newLocation = input.nextLine();
      System.out.println("Tell me a question that distinguishes "
                          +leafNode.getValue()
                          +" from "
                          +newLocation);
      newQuestion = input.nextLine();
      
      leafNode.setRight(new TreeNode(leafNode.getValue()));
      leafNode.setLeft(new TreeNode(newLocation));
      leafNode.setValue(newQuestion);
    }
  }

  private static void restartSuggester() {
    System.out.println("Do you want to start again?"+CHOICE);
    String answer = input.nextLine();
    if (checkAnswer(answer)) {
      cursor = questionTree;
    } else {
      cursor = null;
    }
  }

  private static boolean checkAnswer(String answer) {
    return answer.equals("y");
  }
}