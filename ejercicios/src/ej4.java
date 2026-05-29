import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner numerous = new Scanner(System.in);

        System.out.print("filas: ");
        int filas = numerous.nextInt();
        numerous.nextLine(); 

        String[][] matriz = new String[filas][2];

        for (int i = 0; i < filas; i++) {
            System.out.print("nombre: ");
            matriz[i][0] = numerous.nextLine();

            System.out.print("numero: ");
            matriz[i][1] = numerous.nextLine();
        }
        System.out.println();
        for (int i = 0; i < filas; i++) {
            System.out.println("[" + matriz[i][0] + "][" + matriz[i][1] + "]");
        }

        numerous.close();
    }
}