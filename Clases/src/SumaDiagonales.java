package Clases.src;

import java.util.Scanner;

public class SumaDiagonales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz: ");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];
        int suma = 0;

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        for (int i = 0; i < n; i++) {
            suma += matriz[i][i];
            if (i != n - 1 - i) {
                suma += matriz[i][n - 1 - i];
            }
        }

        System.out.println("Suma de las diagonales: " + suma);
    }
}
