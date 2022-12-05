public class ArrayChess {
    public static void main(String[] args) {
        String[][] bw = {{"W B W B W B W B"}, {"B W B W B W B W"}};
        for (int i = 0; i < 4; i++) {
            for (String[] arr1: bw) {
                for (String x: arr1) {
                    System.out.print(x);
                }
                System.out.println();
            }
        }
    }
}
