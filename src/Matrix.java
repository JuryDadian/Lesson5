public class Matrix {
    public static void main(String[] args) {
        int[][] array = new int[7][7];
        for (int i = 0; i < array.length /2 + 1 ; i++) {
            for (int j =  i; j < array.length - i; j++) {
                array[i][j] = 1;
                array[array.length - i - 1][j] = 1;
            }
        }
        for (int []row:array){
            for (int value: row){
                System.out.print(" " + value + " ");
            }
            System.out.println();
        }
    }
}
