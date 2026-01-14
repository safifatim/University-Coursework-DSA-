public class SearchingIterative { //Fibonacci by recursion

    public static void main(String[] args) {

        int n = 7;

        System.out.println("Fibonacci series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    public static int fib(int n) {
        if (n <= 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }
}





//public class SearchingIterative { //sum of Arrays by recursion
//    public static void main(String[] args) {
//
//        int[] arr = {2, 4, 6, 8, 10};
//
//        int sum = sumArray(arr, 0);
//
//        System.out.println("Sum of array elements: " + sum);
//    }
//
//    public static int sumArray(int[] arr, int index) {
//        if (index == arr.length)
//            return 0;
//
//        return arr[index] + sumArray(arr, index + 1);
//    }
//}

//public class SearchingIterative{
//    public static void main(String[] args) {
//        int no = factorial(5);
//        System.out.println("Factorial: "+ no);
//    }
//    public static int factorial(int n){
//        if (n == 5) {
//            return n*factorial(n-1);
//        }else{
//            return n-1;
//        }
//    }
//}

//Binary search by Iterative method
//import java.util.Arrays;
//public class SearchingIterative {
//    public static void main(String[] args) {
//
//        int arr[] = {1,2,3,4,5,6,7,8,9,10};
//        int l = 0;
//        int h = arr.length - 1;
//        int key = 8;
//
//        int result = binarySearch(arr, key, l, h);
//
//        if (result != -1) {
//            System.out.println("Item found at index: " + result);
//        } else {
//            System.out.println("Item not found");
//        }
//    }
//
//    public static int binarySearch(int arr[], int key, int l, int h) {
//
//        while (l <= h) {
//
//            int mid = (l + h) / 2;
//
//            if (key == arr[mid]) {
//                return mid;
//            }
//            else if (key < arr[mid]) {
//                h = mid - 1;
//            }
//            else {
//                l = mid + 1;
//            }
//        }
//        return -1;
//    }
//}


//public class SearchingIterative{
//
//    public static int linearSearch(int[] arr, int target) {
//
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] == target) {
//                return i;   // found
//            }
//        }
//        return -1;  // not found
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {5, 12, 9, 21, 3};
//        int index = linearSearch(arr, 21);
//
//        System.out.println(index == -1 ? "Not Found" : "Found at index: " + index);
//    }
//}