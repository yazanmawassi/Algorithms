

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();  //Eingabe
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
   
        mergeSort(array);  // Sortiere durch mergeSort
 
        printArray(array);   // der sortierte Array ausdrücken 
    }
    
    public static void mergeSort(int[] target) {
        int[] tmpArray = new int[target.length];
        mergeSort(target, tmpArray, 0, target.length - 1);
    }
    
    private static void mergeSort(int[] target, int[] source, int left, int right) {
        
        if (left < right) {
            
            int mid = (left + right) / 2;
            
            
            mergeSort(target, source, left, mid);   // Sortiere die linke Seite 
            
            
            mergeSort(target, source, mid + 1, right); // Sortiere die Rechte Seite
            
            // Ausdrück von Array
            if(right == target.length - 1){
            printArray(target);
           }
            
            // merge von arrays
            merge(target, source, left, mid, right);
        }
    }
    
    private static void merge(int[] target, int[] source, int left, int mid, int right) {
        // kopiere beide Hälfte im Array
        for (int i = left; i <= right; i++) {
            source[i] = target[i];
        }
        
        int i = left;      // index fuer linke subarray
        int j = mid + 1;   // index fuer rechte subarray
        int k = left;      // index fuer merged array
        
        // Merge beiden Arrays
        while (i <= mid && j <= right) {
            if (source[i] <= source[j]) {
                target[k] = source[i++];
            } else {
                target[k] = source[j++];
            }
            k++;
        }
        
        // kopiere den Rest von Elemente von linke Seite
        while (i <= mid) {
            target[k++] = source[i++];
        }
        
        // kopiere den Rest von Elemente von rechte Seite
        while (j <= right) {
            target[k++] = source[j++];
        }
    }
    
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num+" ");
        }
        System.out.println();
    }
}


