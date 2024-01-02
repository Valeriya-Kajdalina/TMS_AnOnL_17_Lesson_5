import java.util.Scanner;
public class task0 {
    public static void main(String[] args) {
        int[][][] array = new int[3][2][1];
        int chislo;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 1; k++){
                    array[i][j][k] = (int) (Math.random()*20);
                    System.out.println(array[i][j][k]);
                    System.out.println("Введите число: ");
                    chislo = scanner.nextInt();
                    array[i][j][k] += chislo;
                    System.out.println(array[i][j][k]);
                }
    }
}