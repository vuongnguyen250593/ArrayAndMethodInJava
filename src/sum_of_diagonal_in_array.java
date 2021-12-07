import java.util.Scanner;

public class sum_of_diagonal_in_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row number of array: ");
        int length1 = scanner.nextInt();
        System.out.print("Enter column number of array: ");
        int length2 = scanner.nextInt();
        int[][] array = new int[length1][length2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter " + length1 * length2 + " elements of array: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The array is: ");
        display(array);
        sumDiagonal(array);
    }
    public static void display(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sumDiagonal(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum = sum + array[i][j];
                }
            }

        }
        System.out.println("Sum of Diagonal is: " + sum);
    }
}
