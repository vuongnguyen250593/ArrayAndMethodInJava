import java.util.Scanner;

public class add_element_to_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of an array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + i + " of array: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("The array is: ");
        display(array);
        addElement(array);
    }

    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void addElement(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter element you want to change: ");
        int index = scanner.nextInt();
        System.out.print("Enter value you want to add: ");
        int value = scanner.nextInt();
        for (int i = array.length-1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        System.out.println("New array: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
