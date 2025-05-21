import java.util.Arrays;
import java.util.Scanner;

class Main {

    //TODO

    public static int[] count(int[] data, int minValue, int maxValue) {
        int [] c = new int [maxValue - minValue +1];     // Zaehler Array
        int heu,v;
        for(int i=0; i<c.length; i++){
           heu=0;
           v = minValue +i;
           for(int j=0; j<data.length; j++ ){
             if(v==data[j]) heu++; 
           }
           c[i]=heu;
        }
        return c ;
    }

    public static void countingSort(int[] data) {

       int max = data[0];
       int min = data[0];
      // max und min finden (gleichzeitig)
      for(int i=0; i<data.length; i++){
        if(data[i]> max) max = data[i];        //max 
        else if(data[i]< min) min = data[i];   //min 
      }
        int[] c = count(data, min, max);    // Häufigkeiten zählen
        System.out.print(min);
        System.out.print(max);
        System.out.println(Arrays.toString(c));
        int index = 0;
        for (int i = 0; i < c.length; i++){
            int value = i + min;
            for (int j = 0; j < c[i]; j++) {
            data[index++] = value;
            }
        }
       
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();  
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
        data[i] = input.nextInt();
        }
        countingSort(data);
        System.out.print(Arrays.toString(data));
        input.close();
    }
}
