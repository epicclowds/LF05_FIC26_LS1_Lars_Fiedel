package Aufgabe_7.A_7_4;

public class SelectionSort {
    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] liste = { 4, 2, 10, 3, -5, 0, 17 };
        sort(liste);
        for (int num : liste) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}