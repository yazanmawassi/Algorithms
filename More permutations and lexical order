

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Die " + k + "-kleinste Permutation ist:");

        findKthPermutation(array, k);
    }

    static void findKthPermutation(int[] array, int k) {
        int count = 1;
        while (count < k && nextPermutation(array)) {
            count++;
        }

        if (count == k) {
            System.out.println(Arrays.toString(array));
        } 
    }

    static boolean nextPermutation(int[] array) {
        int i = array.length - 2;
        while (i >= 0 && array[i] >= array[i + 1]) {
            i--;
        }

        if (i < 0) return false;

        int j = array.length - 1;
        while (array[j] <= array[i]) {
            j--;
        }

        swap(array, i, j);
        reverse(array, i + 1, array.length - 1);

        return true;
    }

    static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    static void reverse(int[] array, int start, int end) {
        while (start < end) {
            swap(array, start++, end--);
        }
    }
}
