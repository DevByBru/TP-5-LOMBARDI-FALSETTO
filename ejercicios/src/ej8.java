import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("frase: ");
        String frase = teclado.nextLine();

        
        String[] palabras = frase.split(" ");

        System.out.println();

        for (int i = 0; i < palabras.length; i++) {
            
            System.out.println(palabras[i] + " - " + palabras[i].length());
        }

        teclado.close();
    }
}