import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int[][] array = new int[4][3];

        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = (int) (Math.random() * 20);

        System.out.println("Массив: " + Arrays.deepToString(array));
        System.out.print("Диагональ: ");

        if (array.length > array[0].length)
            for (int i = 0; i < array[0].length; i++)
                System.out.print(array[i][i] + "  ");
        else
            for (int i = 0; i < array.length; i++)
                System.out.print(array[i][i] + "  ");

    }
}
