
import java.util.Arrays;
import java.util.Scanner;

class Main {

    static int compare_cnt = 0;

    public static void swap(int[] data, int i, int j) {
        int temp = data[j];
        data[j] = data[i];
        data[i] = temp;
    }

    public static int[] partition(int[] data, int l, int r) {
    compare_cnt++; // Vergleich: p1 < p2
    if (data[l] < data[r]) {
        swap(data, l, r);
    }

    int p1 = data[l];
    int p2 = data[r];
    int i = l + 1;
    int k = r - 1;
    int j = i;

    while (j <= k) {
        compare_cnt++; // Vergleich 1: data[j] > p1
        if (data[j] > p1) {
            swap(data, j, i);
            i++;
            j++;
        } else {
            compare_cnt++; // Vergleich 2: data[j] < p2
            if (data[j] < p2) {
                swap(data, j, k);
                k--;
                // j bleibt gleich
            } else {
                j++;
            }
        }
    }

    swap(data, l, i - 1);
    swap(data, r, k + 1);

    return new int[]{i - 1, k + 1};
}


    public static void quickSort(int[] data, int l, int r) {
        if (l >= r) return;

        int[] pivots = partition(data, l, r);
        System.out.print(data[pivots[0]] + " ");
        System.out.print(data[pivots[1]] + " ");

        quickSort(data, l, pivots[0] - 1);
        quickSort(data, pivots[0] + 1, pivots[1] - 1);
        quickSort(data, pivots[1] + 1, r);
    }

    public static void main(String[] args) {
        compare_cnt = 0;
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        quickSort(arr, 0, n - 1);
        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println("Used " + compare_cnt + " comparisons.");

        input.close();
    }
}
