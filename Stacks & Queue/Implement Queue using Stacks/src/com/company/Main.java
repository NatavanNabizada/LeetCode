package com.company;

import java.util.Stack;

public class Main {

    Stack<Integer> stack;

    public Main() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.add(0, x);
    }

    public int pop() {
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.push(5);
        main.push(10);
        main.push(15);
        main.push(20);
        System.out.println("My Stack - " + main.stack);
        System.out.println(main.pop());
        System.out.println(main.peek());
        System.out.println(main.empty());
    }

}