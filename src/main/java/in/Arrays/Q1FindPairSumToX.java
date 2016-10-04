package in.Arrays;

import java.util.Arrays;
import java.util.HashMap;


/**
 * Created by satheeesh on 3/10/16.
 **/
// Question : Given an array A and a number x, check for pair in A[] with sum as x
public class Q1FindPairSumToX {

    private boolean isTwoCandidatesExist(int []input, int sum) {
        int leftIndex = 0, rightIndex = input.length - 1;
        //Sort the array
        Arrays.sort(input);
        while (leftIndex < rightIndex) {
            if (input[leftIndex] + input[rightIndex] == sum)
                return true;
            else if (input[leftIndex] + input[rightIndex] < sum)
                leftIndex++;
            else // input[leftIndex] + input[rightIndex] > sum
                rightIndex--;
        }
        return false;
    }

    private boolean isTwoCandidatesExistHashBased(int []input, int sum) {
        int index = 0, temp;
        HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>();
        while (index < input.length) {
            temp = sum - input[index];
            if (hashMap.containsKey(temp)) {
                return true;
            }
            hashMap.put(input[index], true);
            index++;
        }

        return false;
    }


    public static void main(String args[]) {
        int[] input = new int[] {10, 45, 23, 14, 26, 8, 9, 11};
        Q1FindPairSumToX q1FindPairSumToX = new Q1FindPairSumToX();
        System.out.println(q1FindPairSumToX.isTwoCandidatesExistHashBased(input, 38));

    }
}
