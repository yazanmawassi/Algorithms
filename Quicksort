import java.util.Arrays;
import java.util.Scanner;

class Main {

    static int compare_cnt = 0;

    public static void swap(int[] data, int i, int j){
      int temp ;
      temp=data[j];
      data[j]=data[i];
      data[i]=temp;
    }

    public static int partition(int[] data, int l, int r) {
        // TODO
        int pivot = data[r];
        int i = l;

        for(int j=l; j<r; j++){
            compare_cnt++;             // wir haben hier vergleichop.
            if (data[j]>=pivot){
                swap(data,j,i);
                i++;
            }
        }
        swap(data,i,r);
        return i; //pos. des pivot 

    }

    public static void quickSort(int[] data, int l, int r) {
        // TODO
       if (l>=r) return;  // Abruchbe.
       int m = partition(data, l, r);
        System.out.print(data[m] +" ");

        quickSort(data,  l,  m-1);


        quickSort(data,  m+1,  r);
        

    }

    public static void main(String[] args) {
        compare_cnt = 0;
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        quickSort(arr,  0, n-1);
        System.out.println(); 
    
        System.out.println(Arrays.toString(arr)); 
        System.out.println("Used " + compare_cnt + " comparisons.");


        input.close();
    }

}
