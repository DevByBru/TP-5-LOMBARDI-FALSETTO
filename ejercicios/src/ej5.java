
public class ej5 {

    public static void main(String[] args) {
        
        String[][] matriz = {
            {"Bruno", "16", "luca"},
            {"Joako", "17", "Lombardi"},
            {"Camilo", "15", "Simon"}
        };
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
}