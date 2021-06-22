package com.company;

public class Main {
    public int lengthOfLastWord(String s) {
        int count = 0;
        if (s == null || s.isEmpty()) {
            return 0;
        }
        String[] words = s.split("\\s+");
        if (words.length >= 1) {
            for (int i = 0; i < words[words.length - 1].length(); i++) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.lengthOfLastWord("Hello World"));
    }
}
