public class find_min_element {
    public static void main(String[] args) {
        int[] array = {1,4,6,7,4,3,8,9};
        int index = minValue(array);
        System.out.println("The smallest element in array is: " + array[index] );
    }
    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
