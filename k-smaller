

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
		         // 1. Lies n ein
		        int n = scanner.nextInt();

		        // 2. Lies n ganze Zahlen ein und speichere die im Array
		        int[] numbers = new int[n];
		        for (int i = 0; i < n; ) {
		            numbers[i] = scanner.nextInt();
		            i++;
		        }
		        
		      // 3. Lies k ein 
		        int k = scanner.nextInt();

		        // 4.  hier wird geprüft, ob k gültig ist
		        if (k > n) {
		            System.out.println("Ungueltige Zahl k="+k+".");
		        } else {
		            
		            Arrays.sort(numbers);  // 5. Sortieren wir das Array

		            // 6. Gib die k-te kleinste Zahl aus (k-1, da Array bei 0 beginnt)
		            System.out.println("Die "+k+"-kleinste Zahl ist "+numbers[k - 1]+"."); 
		        }

		        scanner.close();
    }
}
