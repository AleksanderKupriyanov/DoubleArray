public class Main {
    public static void main(String[] args) {

        int[][] array = new int[10][10];
        int i, j, k = 1;

        //Задание-1.
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                array[i][j] = k++;
            }
        }
        for (int[] ints : array) {
            for (int jk : ints) {
                System.out.print(jk + " ");
            }
            System.out.println();
        }


        //Задание-2.
        int[][] array1 = new int[5][5];
        k = 0;
        for (i = 0; i < array1.length; i++) {
            for (j = 0; j <= i; j++) {
                array1[i][j] = 1;
            }
        }
        for (int[] ints : array1) {
            for (int jk : ints) {
                System.out.print(jk + " ");
            }
            System.out.println();
        }

        //Задание-3.

        for (i = 0; i < array1.length; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
    }
}