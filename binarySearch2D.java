import java.util.Arrays;

public class binarySearch2D {
  public static void main(String[] args) {
    int[][] arr ={
      {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
    };
    System.out.println(Arrays.toString(sortedBinarySearch(arr, 1)));
    System.out.println(Arrays.toString(sortedBinarySearch(arr, 2)));
    System.out.println(Arrays.toString(sortedBinarySearch(arr, 4)));
    System.out.println(Arrays.toString(sortedBinarySearch(arr, 5)));
    System.out.println(Arrays.toString(sortedBinarySearch(arr, 6)));
    System.out.println(Arrays.toString(sortedBinarySearch(arr, 10)));
    System.out.println(Arrays.toString(sortedBinarySearch(arr, 12)));
    System.out.println(Arrays.toString(sortedBinarySearch(arr, 14)));
  }
  // static int[] binarySearch(int[][] matrix, int target){
  //   int r=0;
  //   int c= matrix.length-1;

  //   while(r < matrix.length && c>=0){
  //     if(matrix[r][c]==target){
  //       return new int[] {r,c};
  //     }
  //     if(matrix[r][c]<target){
  //       r++;
  //     }
  //     else{
  //       c--;
  //     }
  //   }
  //   return new int[] {-1,-1};
  // }

  static int[] sortedBinarySearch(int[][] matrix, int target){
    int r=0;
    int c= matrix[0].length-1;

    while(r< matrix.length && c>=0){
      if(matrix[r][c]==target){
        return new int[] {r, c};
      }
      if(matrix[r][c] <target){
        r++;
      }
      else{
        c--;
      }
    }
    return new int[] {-1,-1};
  }
}
