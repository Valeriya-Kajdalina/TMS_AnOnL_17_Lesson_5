import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int[][] array1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] array2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] array3 = new int[3][3];

        for (int k = 0; k < array1.length; k++)
            for (int i = 0; i < array1.length; i++)
                for (int j = 0; j <= array1.length; j++)
                    array3[k][i] += array1[k][j] * array2[j][i];

        System.out.println("Массив: " + Arrays.deepToString(array3));
    }
}
