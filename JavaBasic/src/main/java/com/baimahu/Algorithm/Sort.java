package com.baimahu.Algorithm;

public class Sort {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 9, 2};
        //bubbleSort(array);
        quickSort(array);
        for (int num : array) {
            System.out.println(num + " ");
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void bubbleSort(int[] arr) {
        boolean sorted;

        int temp;
        do {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        } while (!sorted);
    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = arr[(low + high) / 2];
        int index = partition(arr, low, high, pivot);
        quickSort(arr, low, index - 1 );
        quickSort(arr, index, high);
    }

    private static int partition(int[] arr, int low, int high, int pivot) {
        while (low <= high) {
            while (arr[low] < pivot) {
                low ++;
            }
            while (arr[high] > pivot) {
                high --;
            }
            if (low <= high) {
                swap(arr, low, high);
                low ++;
                high --;
            }

        }
        return low;
    }
}
