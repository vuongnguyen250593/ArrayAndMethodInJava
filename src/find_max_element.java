import java.util.Scanner;

public class find_max_element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int k = 0;
        for (k = 0; k < array.length; k++) {
            if (array[k] > max) {
                max = array[k];
            }
        }
        System.out.println();
        System.out.println("max is: " + max + " at position " + (k - 1));
        System.out.println("max is: " + max + " at position " + (k - 1));
    }
}
