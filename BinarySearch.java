public class BinarySearch {
  public static void main(String[] args) {
    int[] arr={-4,0,2,3,16,18,22,45};//sorted
    int target=-21;
    int ans=binarySearch(arr,target);
    int ans1=ceilingBS(arr, target);
    int ans2=floorBS(arr, target);
    System.out.println(ans +" "+ ans1 +" "+ans2 );

  }
  static int binarySearch(int[] arr, int target){
    int start=0;
    int end=arr.length-1;
    while(start<=end){
      int mid=start+(end-start)/2;
      if(target< arr[mid]){
        end=mid-1;
      }
      else if(target> arr[mid]){
        start=mid+1;
      }
      else
      return mid;    
    }
    return -1;
  }

  static int ceilingBS(int[] arr ,int target){
    if(target > arr[arr.length-1]){ //no num greater than target
      return -1;
    }
    int start=0;
    int end=arr.length-1;
    while(start<=end){
      int mid=start+(end-start)/2;
      if(target< arr[mid]){
        end=mid-1;
      }
      else if(target> arr[mid]){
        start=mid+1;
      }
      else
      return mid;    
    }
    return start;
  }
  static int floorBS(int[] arr ,int target){
    int start=0;
    int end=arr.length-1;
    while(start<=end){
      int mid=start+(end-start)/2;
      if(target< arr[mid]){
        end=mid-1;
      }
      else if(target> arr[mid]){
        start=mid+1;
      }
      else
      return mid;    
    }
    return end;
  }
}
 