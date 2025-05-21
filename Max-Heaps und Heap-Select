
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Bottom-up Heapsort: Bubble-Up (Heapify-Up)
    public static void maxHeapifyUp(int[] data, int i) {
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (data[i] > data[parent]) {
                int temp = data[i];
                data[i] = data[parent];
                data[parent] = temp;
                i = parent;
            } else {
                break;
            }
        }
    }

    
    public static void maxHeapifyDown(int[] data, int n) {
        int i = 0;
        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int largest = i;

            if (left < n && data[left] > data[largest]) {
                largest = left;
            }
            if (right < n && data[right] > data[largest]) {
                largest = right;
            }

            if (largest != i) {
                int temp = data[i];
                data[i] = data[largest];
                data[largest] = temp;
                i = largest;
            } else {
                break;
            }
        }
    }

    
    public static void buildMaxHeap(int[] data) {
        for (int i = 1; i < data.length; i++) {
            maxHeapifyUp(data, i);
        }
    }

    
    public static int extractMax(int[] data, int n) {
        int max = data[0];
        data[0] = data[n - 1];
        maxHeapifyDown(data, n - 1);
        return max;
    }

   
    public static int heapSelect(int[] data, int k) {
        int n = data.length;
        buildMaxHeap(data);
        int result = -1;
        for (int j = 0; j < k; j++) {
            result = extractMax(data, n - j);
        }
        return result;
    }

   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Eingabe einlesen 
    int n = scanner.nextInt();
    int[] data = new int[n];
    for (int i = 0; i < n; i++) {
        data[i] = scanner.nextInt();
    }
    int k = scanner.nextInt();

    
    System.out.println(Arrays.toString(data));

    
    int result = heapSelect(data, k);
    System.out.println("Das " + k + "-groesste Element ist " + result);
 }

}

