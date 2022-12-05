public class ArrayDiagonals {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},
                       {1,2,3,4,5},
                       {1,2,3,4,5},
                       {1,2,3,4,5},
                       {1,2,3,4,5}};
        int maxIdx = arr.length - 1;
// 1-я диагоноль
        for (int i = maxIdx; i >= 0; i--) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();
// 2-я диагональ
        for (int i = maxIdx; i >= 0; i--) {
            System.out.print(arr[i][maxIdx - i] + " ");
        }
        System.out.println();
    }
}
