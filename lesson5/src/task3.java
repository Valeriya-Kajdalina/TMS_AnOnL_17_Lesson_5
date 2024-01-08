public class task3 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int summ = 0;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 20);
                summ += array[i][j];
            }
        System.out.print("Сумма всех чисел массива: " + summ);

    }
}
