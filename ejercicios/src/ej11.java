import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("MENU DE OPERACIONES");
        System.out.println("a Sumar 2 matrices");
        System.out.println("b Restar 2 matrices");
        System.out.println("c Multiplicar 2 matrices");
        System.out.print("seleccione una opcion: ");
        char opcion = teclado.next().charAt(0);

        System.out.print("ingrese el tamano N para las matrices (NxN): ");
        int n = teclado.nextInt();

        int[][] matrizA = new int[n][n];
        int[][] matrizB = new int[n][n];
        int[][] resultado = new int[n][n];

        System.out.println("carga de la matriz a");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matriza [" + i + "][" + j + "]: ");
                matrizA[i][j] = teclado.nextInt();
            }
        }

        System.out.println("Carga de la Matriz b");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Matrizb [" + i + "][" + j + "]: ");
                matrizB[i][j] = teclado.nextInt();
            }
        }

        if (opcion == 'a') {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    resultado[i][j] = matrizA[i][j] + matrizB[i][j];
                }
            }
        } else if (opcion == 'b') {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    resultado[i][j] = matrizA[i][j] - matrizB[i][j];
                }
            }
        } else if (opcion == 'c') {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    resultado[i][j] = 0;
                    for (int k = 0; k < n; k++) {
                        resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }
        } else {
            System.out.println("opcion no valida.");
            teclado.close();
            return;
        }

        System.out.println("matriz Resultado");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(resultado[i][j]);
            }
            System.out.println();
        }

        teclado.close();
    }
}