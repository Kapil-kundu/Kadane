
public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-1, 4, -4, 4, 7, -9, 4, 6, 2};

        int maxSum = arr[0];
        int currSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int a = currSum + arr[i];
            int b = arr[i];

            currSum = Math.max(a, b);
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println(maxSum);
    }
}
