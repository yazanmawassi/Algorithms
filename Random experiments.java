
import java.util.Random;
import java.util.Scanner;

public class Main {

    // Pass returned ThreadLocal object to all threads which need it
    public static ThreadLocal<Random> threadRandom(final long seed) {
        return new ThreadLocal<Random>() {
            @Override
            protected Random initialValue() {
                return new Random(seed);
            }
        };
    }

    // Hilfsfunktion zum Vertauschen zweier Werte
    public static void swap(int[] data, int i, int j) {
        int h = data[i];
        data[i] = data[j];
        data[j] = h;
    }

    // Berechnung der Fakultät n!
    public static int fac(int n) {
        if (n < 2) return 1;
        return n * fac(n - 1);
    }

    // Heaps Algorithmus zur sequentiellen Erzeugung aller Permutationen
    public static void updatePermutation(int[] numbers, int[] counters) {
        int i = 0;
        while (i < counters.length) {
            if (counters[i] < i) {
                if (i % 2 == 0) {
                    swap(numbers, 0, i);
                } else {
                    swap(numbers, counters[i], i);
                }
                counters[i]++;
                return;
            } else {
                counters[i] = 0;
                i++;
            }
        }
    }

    // Fisher-Yates-Vorwärts-Shuffle mit ThreadLocal<Random>
    public static void shufflePermutation(int[] numbers) {
        ThreadLocal<Random> randomThreadLocal = threadRandom(100);
        Random rnd = randomThreadLocal.get();

        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            int j = i + rnd.nextInt(n -i); // j ∈ [i, n)
            swap(numbers, i, j);
        }
    }

    // InsertionSort mit Zählen der Verschiebungen
    public static int insertionSort(int[] permutation) {
        int shifts = 0;
        for (int j = 1; j < permutation.length; j++) {
            int key = permutation[j];
            int i = j - 1;
            while (i >= 0 && permutation[i] > key) {
                permutation[i + 1] = permutation[i];
                i--;
                shifts++;
            }
            permutation[i + 1] = key;
        }
        return shifts;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Länge der Permutation
        int k = scanner.nextInt(); // Anzahl Versuche bei n > 10
        scanner.close();

        int totalShifts = 0;
        int maxShifts = 0;
        double averageShifts;

        if (n <= 10) {
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) numbers[i] = i + 1;
            int[] counters = new int[n];
            int[] copy = numbers.clone();
            int shifts = insertionSort(copy);
            totalShifts += shifts;
            maxShifts = shifts;

            int permutations = fac(n);
            for (int i = 1; i < permutations; i++) {
                updatePermutation(numbers, counters);
                copy = numbers.clone();
                shifts = insertionSort(copy);
                totalShifts += shifts;
                if (shifts > maxShifts) maxShifts = shifts;
            }

            averageShifts = (double) totalShifts / permutations;
            System.out.printf("Durchschnittliche Anzahl an Verschiebungen: %.1f\n", averageShifts);
            System.out.println("Hoechste Anzahl an Verschiebungen: " + maxShifts);
        } else {
            int[] numbers = new int[n];
             int shifts;
            for (int i = 0; i < n; i++) numbers[i] = i + 1; //Zahlen im Array einträgen
            
            for (int t = 0; t < k; t++) {

                int[] temp = new int[n];

                shufflePermutation(numbers);

                for(int j=0; j<numbers.length ;j++)temp[j]=numbers[j]; //kopie Erstellen

                shifts = insertionSort(temp);

                totalShifts += shifts;
            }
            averageShifts = (double) totalShifts / k;
            System.out.printf("Durchschnittliche Anzahl an Verschiebungen: %.1f\n", averageShifts);
        }
    }
}
