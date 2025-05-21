
import java.util.Scanner;

public class Main {
    // InsertionSort: zählt und gibt zurück, wie oft array[j] > key geprüft wurde
    public static int insertionSort(int[] array) {
        
        int compareCnt = 0;                            //counter

        for (int i = 1; i < array.length; i++) 
        {
            int key = array[i];
            int j = i - 1;
            while (j >= 0) {
                compareCnt++;                     // jeder Test array[j] > key
                if (array[j] > key) 
                {
                    array[j + 1] = array[j];
                    j--;
                } 
                else 
                {
                    break;
                }
            }
            array[j + 1] = key;
        }
        return compareCnt;
    }

    // Prüft, ob array aufsteigend sortiert ist
    public static boolean isSortedRange(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int p = 0; p < n; p++) {
            arr[p] = scanner.nextInt();
        }

        // Unsortiertes Array ausgeben
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
        }

        System.out.println();            // Neue Zeile nach unsortiertem Array

        // Sortieren und Zählen
        int compares = insertionSort(arr);

        // Sortiertes Array ausgeben
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
        }

        System.out.println();             // Neue Zeile nach sortiertem Array

        // Sortier-Status ausgeben
        if (isSortedRange(arr)) {
            System.out.println("Feld ist sortiert!");
        } 
        else {
            System.out.println("FEHLER: Feld ist NICHT sortiert!");
        }

        // Vergleichszahl ausgeben 
        System.out.println("Das Sortieren des Arrays hat " + compares + " Vergleiche benoetigt.");
    }
}



