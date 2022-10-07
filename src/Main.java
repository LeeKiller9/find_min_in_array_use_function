public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 8, 1, 6, 9};
        System.out.printf("%-10s%s","Array is: ","");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.print("\n");
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index] + ", at position: " + (index + 1));
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