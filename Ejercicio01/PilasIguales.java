package Ejercicio01;

import java.util.Stack; // Importamos la clase Stack

public class PilasIguales {

    public static void main(String[] args) {
        // Agregamos las pilas del ejemplo (h1 = [1,1,1,2,3], h2 = [2,3,4] y h3 = [1,4,1,1])
        int[] arrHeightsH1 = { 1, 1, 1, 2, 3 };
        Stack<Integer> h1 = arrayToStack(arrHeightsH1);
        int[] arrHeightsH2 = { 2, 3, 4 };
        Stack<Integer> h2 = arrayToStack(arrHeightsH2);
        int[] arrHeightsH3 = { 1, 4, 1, 1 };
        Stack<Integer> h3 = arrayToStack(arrHeightsH3);

        // Calculamos y mostramos la máxima altura igual entre las pilas
        int maxHeight = stacksMaxEqualHeight(h1, h2, h3);
        System.out.println("La altura máxima posible de las pilas de modo que todas las pilas tengan"
                + " exactamente la misma altura es: " + maxHeight);

    }

    // El método convierte un arreglo a una pila
    public static Stack<Integer> arrayToStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // Recorremos el arreglo para añadir sus elementos a la pila
        for (int i : arr)
            stack.push(i);

        return stack;
    }

    public static int stacksMaxEqualHeight(Stack<Integer> h1, Stack<Integer> h2, Stack<Integer> h3) {
        // Calculamos la altura de cada pila
        int height1 = stackHeight(h1), height2 = stackHeight(h2), height3 = stackHeight(h3);

        // Quitamos cilindros hasta que las pilas tengan la misma altura
        while (!(height1 == height2 && height2 == height3)) {
            // Calculamos la pila más larga para quitarle un cilindro
            if (height1 > height2 && height1 > height3) // ¿Pila 1 es la más larga?
                height1 -= h1.pop();
            else if (height2 > height3) // ¿Pila 2 es la más larga?
                height2 -= h2.pop();
            else // Pila 3 es la más larga
                height3 -= h3.pop();
        } // Las pilas tienen la misma altura

        return height1;
    }

    // El método calcula la altura de una pila
    public static int stackHeight(Stack<Integer> stack) {
        int totalHeight = 0;

        // Recorremos la pila para acumular la altura de cada cilindro
        for (int cylinderHeight : stack)
            totalHeight += cylinderHeight;

        return totalHeight;
    }
}