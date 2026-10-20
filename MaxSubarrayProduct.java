
public class MaxSubarrayProduct {
    
    public static void main(String[] args) {
        
        int arr[] = {2, -3, -5};

        int maxProduct = arr[0];
        int result = arr[0];
        int minProduct = arr[0];

        for(int i = 1; i < arr.length; i++) {
            int a = arr[i];
            int b = arr[i] * maxProduct;
            int c = arr[i] * minProduct;

            maxProduct = Math.max(a, Math.max(b, c));
            minProduct = Math.min(a, Math.min(b, c));

            result = Math.max(result, Math.max(maxProduct, minProduct));
        }
        System.out.println(result);
        
    }
}