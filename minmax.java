public class minmax {

    // Find minimum value in the array
    public static int minimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {  // Changed to i < arr.length
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Find maximum value in the array
    public static int maximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {  // Changed to i < arr.length
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8, 9};

        // Print the maximum and minimum values
        System.out.println(maximum(arr));
        System.out.println(minimum(arr));
    }
}