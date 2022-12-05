import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[][] array = {{1,0,3,2,4},
                         {6,7,5},
                         {9,8}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int lastC = j + 1;
                for (int lastR = i; lastR < array.length; lastR++) {
                    while ( lastC < array[lastR].length) {
                         if ( array[lastR][lastC] < array[i][j] ) {
                            int tmp = array[i][j];
                            array[i][j] = array[lastR][lastC];
                            array[lastR][lastC] = tmp;
                         }
                        lastC++;
                    }
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
