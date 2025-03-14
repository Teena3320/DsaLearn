
import java.util.Arrays;

public class CyclicSort {
  public static void main(String[] args) {
    int[] arr ={3, 5,2,1,4,6};//1-n nums only

    System.out.println(Arrays.toString(cyclicSort(arr)));
  }

  static int[] cyclicSort(int[] arr){
    int i=0;
    while(i<arr.length){
      int correct =arr[i]-1;
      if(arr[i]!=arr[correct]){//swap
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
      }
      else{
        i++;
      }
      
    }

    return arr;
  }
  
}
