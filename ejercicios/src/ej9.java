import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[][] matriz = new int[4][3];

        for (int i = 0; i < 4; i++) {
            System.out.print("fila " + i + " - numero 1: ");
            matriz[i][0] = teclado.nextInt();

            System.out.print("fila " + i + " - numero 2: ");
            matriz[i][1] = teclado.nextInt();

            matriz[i][2] = matriz[i][0] + matriz[i][1];
        }

        System.out.println();
        System.out.println("Col1 + Col2 = Resultado");

        for (int i = 0; i < 4; i++) {
            System.out.println(matriz[i][0] + " + " + matriz[i][1] + " = " + matriz[i][2]);
        }

        teclado.close();
    }
}
