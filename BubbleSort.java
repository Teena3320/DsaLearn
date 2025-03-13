
import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    int[] arr={3,1,5,4,2};
    System.out.println(Arrays.toString(bubbleSort(arr)));
  }
  
  static int[] bubbleSort(int[] arr){
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr.length-i+1; j++){//-i as end gets sorted 
        if( j < arr.length-1 && arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
          // System.out.println(Arrays.toString(arr));
        }
        else{
          // System.out.println(Arrays.toString(arr));
        }
      }
      i++;
    }
    return arr;
  }
  
}
