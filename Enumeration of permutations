

import java.util.Scanner;

public class Main {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);

        // Einlesen von Anzahl der Zahlen
        int n = s.nextInt();

        // Einlesen der Zahlen in ein Array
        int[] array = new int[n];
        for (int k = 0; k < n; ) {
            array[k++] = s.nextInt();
        }

        PermutationCounter c = new PermutationCounter();
        permute(array, 0, c);

        System.out.println("Es gibt " + c.count + " Permutation(en) der Eingabe.");
        s.close();
    }

    static void permute(int[] a, int d, PermutationCounter c) {
        if (d == a.length) {
            for (int i = 0; i < a.length; ) {
                System.out.print(a[i] + (++i < a.length ? " " : "\n"));
            }
            c.count++;
            return;
        }
        for (int i = d; i < a.length; i++) {
            swap(a, d, i);
            permute(a, d + 1, c);
            swap(a, d, i);
        }
    }

    static void swap(int[] a, int i, int j) {
        if (i != j) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }

    static class PermutationCounter {
        int count;
    }
}
