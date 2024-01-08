import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                array[i][j] = (int) (Math.random() * 20);
            }
        for (int i = 0; i < 5; i++)
            Arrays.sort(array[i]);
        System.out.println("Новый массив: " + Arrays.deepToString(array));
    }
}
