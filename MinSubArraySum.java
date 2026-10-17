
public class MinSubArraySum {
    public static void main(String[] args) {
        
        int arr[] = {1, -3, 5, 2, -9, 7, 3, -1, -4, 9, 3, -5};
        int minSum = arr[0];
        int currSum = arr[0];

        for(int i = 1; i < arr.length; i++) {
            int a = currSum + arr[i];
            int b = arr[i];

           currSum = Math.min(a, b);
           minSum = Math.min(currSum, minSum);
        }
        System.out.println(minSum);
    }
}