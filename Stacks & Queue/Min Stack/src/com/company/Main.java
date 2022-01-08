package com.company;

import java.util.Stack;

public class Main {

    Stack<Integer> stack = new Stack<>();
    int min = Integer.MAX_VALUE;

    public void push(int x) {
        if (x <= min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if (stack.pop() == min)
            min = stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.push(5);
        main.push(10);
        main.push(15);
        main.push(20);
        main.push(2);
        System.out.println("My Stack - " + main.stack);
        main.pop();
        System.out.println(main.top());
        System.out.println(main.getMin());
    }

}