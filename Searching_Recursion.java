public class Searching_Recursion {
    // Recursive function
    public static int linearSearchRec(int[] arr, int target, int index) {

        // base case: index out of range
        if(index == arr.length) {
            return -1;   // not found
        }

        // check current element
        if(arr[index] == target) {
            return index;
        }

        // recursive call for next index
        return linearSearchRec(arr, target, index + 1);
    }

    // Main function
    public static void main(String[] args) {

        int[] arr = {5, 12, 7, 25, 3};
        int target = 25;

        int result = linearSearchRec(arr, target, 0);

        if(result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Found at index: " + result);
    }
}

//public class Searching_Recursion {
//    public static void main(String[] args) {
//
//        int arr[] = {2, 4, 6, 8, 10, 12, 14};
//        int key = 10;
//
//        int result = binarySearch(arr, 0, arr.length - 1, key);
//
//        if (result != -1) {
//            System.out.println("Element found at index: " + result);
//        } else {
//            System.out.println("Element not found");
//        }
//    }
//
//    public static int binarySearch(int[] arr, int l, int h, int key) {
//
//        // Base case: element not found
//        if (l > h)
//            return -1;
//
//        int mid = (l + h) / 2;
//
//        // If element found
//        if (arr[mid] == key)
//            return mid;
//
//        // Search in left half
//        if (key < arr[mid])
//            return binarySearch(arr, l, mid - 1, key);
//            // Search in right half
//        else
//            return binarySearch(arr, mid + 1, h, key);
//    }
//}