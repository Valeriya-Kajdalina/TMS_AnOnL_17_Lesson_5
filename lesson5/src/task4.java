public class task4 {
    public static void main(String[] args) {
        int[][] array = new int[5][5]; int k = array.length - 1;
        System.out.print("Первая диагональ: ");
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++){
                array[i][j] = (int) (Math.random()*20);
                if(i == j)
                    System.out.print(array[i][j] + "  ");
            }
        System.out.println();
        System.out.print("Вторая диагональ: ");
        for (int i = 0; i < 5; i++){
            System.out.print(array[i][k] + "  ");
        }

    }
}
