
import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
    int[] arr={4,-5,1,-902,-3098};
    System.out.println(Arrays.toString(insertionSort(arr)));
  }

  static int[] insertionSort(int[] arr){
    for(int i=0; i<arr.length; i++){
      int end=arr.length-i-1;
      int swapindex =max(arr,end);
      int temp=arr[swapindex];
      arr[swapindex]=arr[end];
      arr[end]=temp;
    }
    return arr;
  }

  static int max(int[] arr, int end){
    int max=arr[0];
    int maxindex=0;
    for(int i=0; i<=end; i++){
      if(arr[i]>max){
        max=arr[i];
        maxindex=i;
      }
    }
    // System.out.println(max);
    return maxindex;
  }

}
