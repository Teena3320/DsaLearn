import java.util.Scanner;

public class minmax {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter length of list: ");
    int n=sc.nextInt();
    System.out.println("Enter the elements of list: ");
    int[] arr=new int[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Smallest element is: "+min(arr));
    System.out.println("Largest element is: "+max(arr));
  }

  public static int min(int[] arr){
    int min=arr[0];
    for(int ch:arr){
      if(ch<min){
        min=ch;
      }
    }
    return min;
  }
  public static int max(int[] arr){
    int max=arr[0];
    for(int ch:arr){
      if(ch>max){
        max=ch;
      }
    }
    return max;
  }
}
