public class duplicatedRotatedBS {
    public static void main(String[] args) {
      int[] nums = {4,5,6,7,0,1,2,3};
      int target = 2;
      System.out.print(search(nums, target));
    }
  
    public static int search(int[] nums, int target) {
      int peak=pivotDuplicates(nums);
      int firstTry = binarySearch(nums,target, 0, peak );
      if(firstTry != -1){
        return firstTry;
      }
      else{
        return binarySearch(nums, target, peak+1, nums.length-1);
      }
    }
  
    public static int binarySearch(int[] nums, int target, int start, int end){
      while(start<end){
        int mid= start+(end-start)/2;
        if(nums[mid]==target){
          return mid;
        }
        else{
          if(nums[mid]<nums[mid+1]){
            start=mid+1;
          }
          else{
            end=mid-1;
          }
        }
      }
      return -1;
    }
  
    public static int pivotDuplicates(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid= start +(end-start)/2;
            if(mid < end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid]<nums[mid-1]){
                return mid-1;
            }//if elements at start mid end are equal (skip duplicates)
            if(nums[mid]== nums[start] && nums[mid]==nums[end]){
              //check if pivot before skipping
              if(nums[start]>nums[start+1]){
                return start;
              }
              start ++;
              if(nums[end]<nums[end-1]){
                return end-1;
              }
              end--;
            }//left is sorted, so pivot in right
            else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])){
              start = mid+1;
            }
            else{
              end= mid-1;
            }
        }
        return -1;
    }
  }
  