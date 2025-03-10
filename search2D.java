import java.util.Arrays;
import java.util.Scanner;

public class search2D {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter size of 2D list: ");
    int n=sc.nextInt();
    int[][] arr=new int[n][n];
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        arr[i][j]=sc.nextInt();
      }
    }
    System.out.print("Enter tagert to be searched: ");
    int target=sc.nextInt();
    for(int i=0; i<n; i++){
      System.out.println(Arrays.toString(arr[i]));
    }
  
    System.out.println("Target found at index: "+ Arrays.toString(search(arr, target)));
  }

  public static int[] search(int[][] arr, int target){
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[i].length; j++){
        if(arr[i][j]==target)
          return new int[]{i,j};
      }
    }
    return new int[]{-1,-1};
  }
}
