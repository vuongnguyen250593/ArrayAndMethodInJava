import java.util.Scanner;

public class delete_element_in_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + i + " of array: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("The array is: ");
        display(array);
        deleteElement(array);
    }

    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void deleteElement(int[] array) {
        System.out.print("Enter element you want to delete: ");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        for (int i = index; i < array.length-1; i++) {
            array[i] = array[i + 1];
        }
        System.out.println("New array: ");
        for (int element : array) {
            System.out.println(element);
        }
    }
}
