package in.Utilities;

/**
 * Created by satheeesh on 3/10/16.
 */
public class ArrayUtilities {

    public static void printArrayElements(int[] input) {
        for (int index = 0; index < input.length; index++) {
            System.out.println(input[index] + "\n");
        }
    }

    public static void swap(int[] input, int index1, int index2) {
        int temp = input[index1];
        input[index1] = input[index2];
        input[index2] = temp;
    }
}
