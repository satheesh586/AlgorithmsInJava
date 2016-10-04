package in.Arrays;

/**
 * Created by satheeesh on 3/10/16.
 */
//Find the maximum difference between two elements such that larger element appears after the smaller number
public class Q5MaxDifference {

    private int getMaximumDifference(int[] input) {
        int maxDiffernce = Integer.MIN_VALUE;
        int index = 1, minElementSoFar = input[0];
        while(index < input.length) {
            if (input[index] > minElementSoFar) {
                if (input[index] - minElementSoFar > maxDiffernce) {
                    maxDiffernce = input[index] - minElementSoFar;
                }
            }
            else {
                minElementSoFar = input[index];
            }
            index++;
        }
        return maxDiffernce;
    }

    public static void main(String args[]) {
        int[] input = new int[] {10, 23, 14, 26, 8, 9, 11, 45};
        Q5MaxDifference q5MaxDifference = new Q5MaxDifference();
        System.out.println(q5MaxDifference.getMaximumDifference(input));
    }
}
