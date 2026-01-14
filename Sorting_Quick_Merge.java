import java.util.Arrays;
//Merge Sort
public class Sorting_Quick_Merge {

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1};
        divide(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

//import java.util.Arrays;
//
//public class QuickSort {
//    static void quickSort(int[] arr, int low, int high) {
//        if (low < high) {
//            int pi = partition(arr, low, high);
//
//            quickSort(arr, low, pi - 1);
//            quickSort(arr, pi + 1, high);
//        }
//    }
//
//    static int partition(int[] arr, int low, int high) {
//        int pivot = arr[high];
//        int idx = (low - 1);
//        for (int j = low; j < high; j++) {
//            if (arr[j] < pivot) {
//                idx++;
//
//                swap(arr, j, idx);
//            }
//        }
//        idx++;
//        swap(arr,high,idx);
//        return idx;
//    }
//    public static void swap(int arr[],int i,int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    public static void main (String[] args){
//        int[] arr = {8,35,4,1};
//        quickSort(arr,0,arr.length - 1);
//        System.out.println("Sorted array: "  + Arrays.toString(arr));
//    }
//
//}