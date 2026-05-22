public class ej1 {
    public static void main(String[] args) {
        int[][] matriz = {
            {4, 5},
            {3, 2}
        };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }
}