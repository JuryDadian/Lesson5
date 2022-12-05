import java.util.Scanner;

public class ArrayThree {
    public static void main(String[] args) {
        int[][][] array = {{{1, 2, 3},{10, 20, 30, 40}}, {{500, 600}}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = sc.nextInt();
        for (int[][] arr1: array) {
            for (int[]arr2: arr1) {
                for (int x: arr2) {
                    System.out.print(x + number + " ");
                }
                System.out.println();
            }
        }
    }
}
