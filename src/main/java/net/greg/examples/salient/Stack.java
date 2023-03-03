package net.greg.examples.salient;

import java.util.*;


public final class Stack {

  Node node;

  private class Node {

    private Node previous;
    private int state;

    Node (Node prev, int value) {
      previous = prev;
      state = value;

      System.err.println(previous + " " + state);
    }
  }


  public static void main(String[] a) {

    new Stack().go();
  }

  private void go() {

    node = new Node(null, 0);

    push(1);
    push(2);
    push(3);

    pop();
  }

  private final Node push(int val) {

    Node tmp = new Node(node, val);
    node = tmp;
    return node;
  }

  private final Node pop() {

    Node tmp = node.previous;
    node = tmp;

    System.err.println("pop(). node.state: " + node.state);
    return node;
  }
}
