public class binarySearchRecursion {
  public static void main(String[] args) {
    int [] arr={-4,-2,1,3,4,7,9,13,15};
    System.out.println(binarySearch(arr,0,arr.length-1,6));
  }
  static int binarySearch(int[] arr,int start, int end ,int target){
    int mid=start + (end-start)/2;
    if(start==end && target != arr[mid]){
      return -1;
    }
    if( target==arr[mid]){
      return mid;
    }
    else{
      if(target>arr[mid]){ 
        start=mid+1;
      }
      else{
        end=mid;
      }
    }

    return binarySearch(arr,start,end,target);
  }
}