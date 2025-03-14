
import java.util.Arrays;

public class InsertionSort { 
  public static void main(String[] args) {
    int[] arr={235,367,-4,91,-2};

    System.out.println(Arrays.toString(insertionSort(arr)));
  }

static int[] insertionSort(int[] arr){
  for(int i=0; i<arr.length-1; i++){
    for(int j=i+1; j>0; j--){
      if(arr[j]<arr[j-1]){//swap
        int temp=arr[j];
        arr[j]=arr[j-1];
        arr[j-1]=temp;
      }
      
    }
  }

  return arr;
}

}
  