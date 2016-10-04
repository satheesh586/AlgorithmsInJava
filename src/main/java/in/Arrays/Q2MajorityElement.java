package in.Arrays;

/**
 * Created by satheeesh on 3/10/16.
 */
//Given an array with 'n' elements, Find a majority element in an array
public class Q2MajorityElement {

    private boolean isMajorityElement(int[] input, int element) {
        int inputSize = input.length, repeatedCount = 0;
        for (int index = 0; index < inputSize; index++) {
            if (input[index] == element) {
                repeatedCount++;
            }
        }

        return repeatedCount > inputSize / 2;
    }

    private int getCandidate(int input[]) {
        int majIndex = 0, count = 1, index;
        for (index = 1; index < input.length; index++) {
            if (input[majIndex] == input[index])
                count++;
            else
                count--;
            if (count == 0) {
                majIndex = index;
                count = 1;
            }
        }
        return input[majIndex];
    }

    //Moore Voting Algorithm
    private int getMajorityElement(int[] input) {
        int majorityCandidate = getCandidate(input);
        if (!isMajorityElement(input, majorityCandidate)) {
            return -1;
        }
        return majorityCandidate;
    }

    public static void main(String args[]) {
        int[] input = new int[]{45, 45, 13, 10, 10, 45, 10};
        Q2MajorityElement q2MajorityElement = new Q2MajorityElement();
        System.out.println(q2MajorityElement.getMajorityElement(input));
    }
}
