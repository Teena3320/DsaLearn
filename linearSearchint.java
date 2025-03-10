import java.util.Scanner;

public class linearSearchint{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int n=sc.nextInt();
    System.out.println("Enter elements: ");
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.print("Enter num to be searched: ");
    int search=sc.nextInt();
    // int index=linSearch(arr,search);
    // System.out.println("Element found at "+ index+" index position.");
    System.out.print("Enter range: ");
    int start=sc.nextInt();
    int end=sc.nextInt();
    int index=linSearchrange(arr, search, start, end);
    System.out.println(index+" Index position");
  }

  static int linSearch(int[] arr, int search){
    for(int i=0; i<arr.length; i++){
      if(arr[i]==search)  
        return i;
    }
    return -1;
  }  
  static int linSearchrange(int[] arr, int search, int start, int end){
    for(int i=start; i<=end; i++){
      if(arr[i]==search)  
        return i;
    }
    return -1;
  }  
}