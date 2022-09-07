package com.atdk.git.game.Demo1;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        String input = scanner.nextLine();
        input = input.substring(1, input.length()-1);
        String[] inputs = input.split(",");

        //int[] target = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            stack.push(Integer.parseInt(inputs[i]));
        }

        int left = 0, right = stack.size() - 1;
        int res = 0;
        while (left < right) {
            int x = right - left;
            int y = Math.min(stack.get(left), stack.get(right));
            res = Math.max(res, x * y);
            if (stack.get(left) < stack.get(right)) {
                left++;
            } else {
                right++;
            }
        }
        System.out.println();
    }
}