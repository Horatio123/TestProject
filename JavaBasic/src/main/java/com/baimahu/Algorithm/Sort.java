package com.baimahu.Algorithm;

public class Sort {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 9, 2};
        BubbleSort bubbleSort = new BubbleSort();
        int[] arrRes = bubbleSort.sort(array);

        for (int num : arrRes) {
            System.out.println(num + " ");
        }
    }

}
class BubbleSort{

    public BubbleSort() {
    }

    public int[] sort(int[] arr) {
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

        return arr;
    }
}