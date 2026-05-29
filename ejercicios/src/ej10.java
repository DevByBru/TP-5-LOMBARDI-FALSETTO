import java.util.Scanner;
import java.util.Random;

public class ej10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] temperaturas = new int[5][7];

        llenarMatriz(temperaturas);
        
        System.out.println("Temperaturas registradas (Semanas 1-5, Lunes a Domingo):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(temperaturas[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            extremosSemana(temperaturas, i);
        }

        System.out.print("\nIngrese el numero de semana (1 a 5) para saber el promedio: ");
        int sem = teclado.nextInt();
        
        if (sem >= 1 && sem <= 5) {
            promedioSemana(temperaturas, sem - 1);
        } else {
            System.out.println("Semana no valida.");
        }

        teclado.close();
    }

    public static void llenarMatriz(int[][] m) {
        Random r = new Random();
        int dia = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (dia <= 31) {
                    m[i][j] = r.nextInt(32) + 7;
                    dia++;
                } else {
                    m[i][j] = 0;
                }
            }
        }
    }

    public static void extremosSemana(int[][] m, int s) {
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int max = -1;
        int min = 100;
        String diaMax = "";
        String diaMin = "";
        boolean tieneDatos = false;

        for (int j = 0; j < 7; j++) {
            if (m[s][j] != 0) {
                tieneDatos = true;
                if (m[s][j] > max) {
                    max = m[s][j];
                    diaMax = dias[j];
                }
                if (m[s][j] < min) {
                    min = m[s][j];
                    diaMin = dias[j];
                }
            }
        }

        if (tieneDatos) {
            System.out.println("Semana " + (s + 1) + " -> Maxima: " + max + " (" + diaMax + ") | Minima: " + min + " (" + diaMin + ")");
        } else {
            System.out.println("Semana " + (s + 1) + " -> Sin datos registrados");
        }
    }

    public static void promedioSemana(int[][] m, int s) {
        int suma = 0;
        int cont = 0;

        for (int j = 0; j < 7; j++) {
            if (m[s][j] != 0) {
                suma += m[s][j];
                cont++;
            }
        }

        if (cont > 0) {
            double prom = (double) suma / cont;
            System.out.println("El promedio de la semana " + (s + 1) + " es: " + prom);
        } else {
            System.out.println("La semana seleccionada no tiene dias registrados.");
        }
    }
}
