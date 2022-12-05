import java.util.Arrays;

public class ArrayTwoSum {
    public static void main(String[] args) {
        int[][] array = {{1,0,2},{3,0},{5,6},{7,0,8}};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
        }
        System.out.println(sum);
    }
}

