public class MatrixMultiplection {
    public static void main(String[] args) {
        int[][] mA = {{1,0,0,0},{0,1,0,0},{0,0,0,0},};
        int[][] mB = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        int m = mA.length;
        int n = mB[0].length;
        int o = mB.length;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += mA[i][k] * mB[k][j];
                }
            }
        }
        for (int[] re : res) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.printf("%1d ", re[j]);
            }
        }
    }
}

