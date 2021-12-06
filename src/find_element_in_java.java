import java.util.Scanner;

public class find_element_in_java {
    public static void main(String[] args) {
//        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter name that you want to find: ");
//        String input_name = scanner.nextLine();
//        boolean isExist = false;
//        for (int i = 0; i < students.length; i++) {
//            if (students[i].equals(input_name)) {
//                System.out.println("Position of the students in the list " + input_name + " is: " + i);
//                isExist = true;
//                break;
//            }
//        }
//        if (!isExist) {
//            System.out.println("Not found" + input_name + " in the list.");
//        }

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number that you want to find: ");
        int number = scanner.nextInt();
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.println("Position of the number in the list is: " + i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not Found");
        }
    }


}
