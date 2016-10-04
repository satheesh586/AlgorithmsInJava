package in.Arrays;

import in.Utilities.ArrayUtilities;

/**
 * Created by satheeesh on 3/10/16.
 */
//Segregate 0s and 1s in an array
public class Q4Segregate {

    public static void main(String args[]) {
        int[] input = new int[]{0, 1, 0, 1, 1, 0, 0, 1, 0};
        Q4Segregate q4Segregate = new Q4Segregate();
        q4Segregate.segregateElements(input);
        ArrayUtilities.printArrayElements(input);
    }

    private void segregateElements(int[] input) {
        int inputSize = input.length;
        int leftIndex = 0, rightIndex = inputSize -1 ;
        while (leftIndex < rightIndex) {
            while (input[leftIndex] == 0 && leftIndex < rightIndex) {
                leftIndex++;
            }
            while (input[rightIndex] == 1 && leftIndex < rightIndex) {
                rightIndex--;
            }
            if (leftIndex < rightIndex) {
                ArrayUtilities.swap(input, leftIndex, rightIndex);
            }
        }
    }

}
