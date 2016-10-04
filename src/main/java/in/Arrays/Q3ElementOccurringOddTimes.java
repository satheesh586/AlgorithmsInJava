package in.Arrays;

/**
 * Created by satheeesh on 3/10/16.
 */
//Find the number occurring odd number of times in a given elements
public class Q3ElementOccurringOddTimes {

    private int getElementOccuredOddTimes(int input[]) {
        int resultElement = 0;
        for (int index = 0; index < input.length ; index++) {
            resultElement = resultElement ^ input[index];
        }
        return resultElement;
    }

    public static void main(String args[]) {
        int[] input = new int[]{45, 45, 13, 45, 10, 45, 10, 13, 13};
        Q3ElementOccurringOddTimes q3ElementOccurringOddTimes = new Q3ElementOccurringOddTimes();
        System.out.println(q3ElementOccurringOddTimes.getElementOccuredOddTimes(input));
    }
}
