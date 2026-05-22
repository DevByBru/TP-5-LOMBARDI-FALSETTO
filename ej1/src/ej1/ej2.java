public class ej2 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 5, 4},
            {2, 4, 5},
            {1, 2, 3}
        };

        int i = 0;
        while (i < 3) {
            int j = 0;
            while (j < 3) {
                System.out.print("[" + matriz[i][j] + "]");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}