import java.util.Scanner;

public class task0 {
    public static void main(String[] args) {
        int[][][] array = new int[3][2][1];
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        number = scanner.nextInt();

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 1; k++) {
                    array[i][j][k] = (int) (Math.random() * 20);
                    System.out.println(array[i][j][k]);
                    array[i][j][k] += number;
                    System.out.println(array[i][j][k]);
                }
    }
}