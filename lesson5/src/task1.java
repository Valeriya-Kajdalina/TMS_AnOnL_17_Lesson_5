import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        String[][] chess = new String[8][8];
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                chess[i][j] = (i + j) % 2 == 0 ? "W" : "B";

        System.out.println("Массив: " + Arrays.deepToString(chess));
    }
}
