
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner numerous = new Scanner(System.in);
        String[][] matriz = new String[3][3];

        for (int i = 0; i < 3; i++) {
            System.out.print("nombre: ");
            matriz[i][0] = numerous.nextLine();

            System.out.print("edad: ");
            matriz[i][1] = numerous.nextLine();

            System.out.print("sueldo: ");
            matriz[i][2] = numerous.nextLine();
        }

        System.out.println();
        System.out.println("nombre - edad - sueldo");

        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i][0] + " - " + matriz[i][1] + " - " + matriz[i][2]);
        }

        numerous.close();
    }
}