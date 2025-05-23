

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    
    public static int removeDuplicates(int[] data) {
        Arrays.sort(data);  // Array sortieren 
        int m = 0;
        for (int k = 0; k < data.length; k++) {
            if (m == 0 || data[k] != data[m - 1]) {
                data[m++] = data[k];
            }
        }
        return m;  // Rückgabe der Anzahl eindeutiger Elemente
    }

    
    public static int printSubsets(int[] data, int fixed, int m, int n, int k) {
        if (k > m) {
            k = m;
        }
        int[] subset = new int[k];
        return generateSubsets(data, fixed, subset, 0, m, k);
    }

    
    private static int generateSubsets(int[] data, int start, int[] subset, int depth, int m, int k) {
        if (depth == k) {
            System.out.println(Arrays.toString(subset));
            return 1;
        }

        int count = 0;
        for (int i = start; i <= m - (k - depth); i++) {
            subset[depth] = data[i];
            count += generateSubsets(data, i + 1, subset, depth + 1, m, k);
        }
        return count;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();  // n einlesen
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();  
        }

        int k = scanner.nextInt();  

        //  ursprünglichen Arrays ausdrücken
        System.out.println(Arrays.toString(data));

        // Duplikate löchen
        int m = removeDuplicates(data);

        // Ausgabe ohne Duplikate
        System.out.println(Arrays.toString(Arrays.copyOf(data, m)));

        
        int count = printSubsets(data, 0, m, n, k);

        
        System.out.println("Anzahl an Teilmengen: " + count);
    }
}
