package Clases.src;
import java.util.*;
public class Solution {
    static int solveMeFirst(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un primer numero");
        int a;
        a = in.nextInt();
        System.out.println("Ingrese un segundo numero");
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println("El resultado de la suma es: " + sum);
    }
}
