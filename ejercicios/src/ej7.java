import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("filas: ");
        int filas = teclado.nextInt();

        System.out.print("columnas: ");
        int columnas = teclado.nextInt();

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("valor en [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        int suma = 0;
        int contador = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i % 2 != 0 && j % 2 != 0) {
                    suma = suma + matriz[i][j];
                    contador++;
                }
            }
        }

        System.out.println();

        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("promedio posiciones impares: " + promedio);
        } else {
            System.out.println("no hay posiciones impares para calcular");
        }

        teclado.close();
    }
}
