package ej1;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("filas: ");
        int filas = num.nextInt();

        System.out.print("columnas: ");
        int columnas = num.nextInt();

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("valor en [" + i + "][" + j + "]: ");
                matriz[i][j] = num.nextInt();
            }
        }
        System.out.println();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }

        num.close();
    }
}