package Ejercicio01;

import java.util.Stack;

public class PilasIguales {

    public static void main(String[] args) {
        int[] arrHeightsH1 = { 1, 1, 1, 2, 3 };
        Stack<Integer> h1 = arrayToStack(arrHeightsH1);

        int[] arrHeightsH2 = { 2, 3, 4 };
        Stack<Integer> h2 = arrayToStack(arrHeightsH2);

        int[] arrHeightsH3 = { 1, 4, 1, 1 };
        Stack<Integer> h3 = arrayToStack(arrHeightsH3);

        int maxHeight = stacksMaxEqualHeight(h1, h2, h3);
        System.out.println("La altura máxima posible de las pilas de modo que todas las pilas tengan"
                + " exactamente la misma altura es: " + maxHeight);

    }

    public static Stack<Integer> arrayToStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i : arr)
            stack.push(i);

        return stack;
    }

    public static int stacksMaxEqualHeight(Stack<Integer> h1, Stack<Integer> h2, Stack<Integer> h3) {
        int height1 = stackHeight(h1), height2 = stackHeight(h2), height3 = stackHeight(h3);

        while (!(height1 == height2 && height2 == height3)) {
            if (height1 > height2 && height1 > height3)
                height1 -= h1.pop();
            else if (height2 > height3)
                height2 -= h2.pop();
            else
                height3 -= h3.pop();
        }

        return height1;
    }

    public static int stackHeight(Stack<Integer> stack) {
        int totalHeight = 0;

        for (int cylinderHeight : stack)
            totalHeight += cylinderHeight;

        return totalHeight;
    }
}