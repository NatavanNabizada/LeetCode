package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    Queue<Integer> queue;

    public Main() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        for (int i = 1; i < x; i++) {
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.push(5);
        main.push(10);
        main.push(15);
        main.push(20);
        System.out.println("My queue - " + main.queue);
        System.out.println(main.pop());
        System.out.println(main.top());
        System.out.println(main.empty());
    }

}