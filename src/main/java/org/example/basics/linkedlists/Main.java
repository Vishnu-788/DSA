package org.example.basics.linkedlists;

import org.example.basics.Stacks.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        stack.show();
        stack.push(1);

        stack.push(2);
        stack.show();
        stack.push(3);
        stack.show();
        stack.push(3);
        stack.show();
        stack.push(3);
        stack.show();
        stack.push(3);
        stack.show();
        stack.push(3);
        stack.show();
        stack.push(1);
        stack.show();
        stack.push(33);
        stack.show();

        stack.pop();
        stack.show();

        stack.pop();
        stack.show();

        stack.pop();
        stack.show();

        stack.pop();
        stack.show();

        stack.pop();
        stack.show();

        stack.pop();
        stack.show();

        stack.pop();
        stack.show();

        stack.pop();
        stack.show();
    }
}
