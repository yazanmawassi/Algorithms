
import java.util.Arrays;
import java.util.Scanner;

class Main { 
  

    public static void sortByByte(int data[], int b) {
        int [] count = new int[256];
        int [] output = new int[data.length]; //als zwischen Speicher
        
        // werte der bytes berechnen und die Heufigkeit rechnen
        for (int i = 0; i < data.length; i++) {
           int byteValue = (data[i] >> (8 * b)) & 0xFF;
           count[byteValue]++;
        }
        for (int i = 1; i < 256; i++) {
          count[i] += count[i - 1];
        }
        for (int i = data.length - 1; i >= 0; i--) {
          int byteValue = (data[i] >> (8 * b)) & 0xFF;
          output[--count[byteValue]] = data[i];
        }
        for (int i = 0; i < data.length; i++) {
         data[i] = output[i];
        }
   
    }

    public static void radix(int data[]) {
        //TODO
        sortByByte(data, 0);
        System.out.println(Arrays.toString(data));
        sortByByte(data, 1);
         System.out.println(Arrays.toString(data));
        sortByByte(data, 2);
         System.out.println(Arrays.toString(data));
        sortByByte(data, 3);
        System.out.print(Arrays.toString(data));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int[]data =new int[n];
        for(int i = 0 ; i< n ; i++){
           data[i]= input.nextInt();
        }
        radix(data);

        input.close();
    }

}
