public class InfinitySearch {
     public static void main(String[] args) {
      int[] nums={1,2,4,5,6,7,9};
      int target =9;
      System.out.println(startAndEnd(nums, target));
     }
     static int startAndEnd(int[] nums,int target){
       int start=0;
       int end=1;
      
      while(nums[end]<=target){
         start=end;
         end=(end+1)*2; 
        }
        
       return binarysearch(nums, target, start, end);
     }
     static int binarysearch(int[] nums,int target ,int start,int end){
      while(start<=end){
        int mid=start+(end-start)/2;
         if(nums[mid]==target){
            return mid;
         }
         else if(nums[mid]>target){
            end=mid-1;
         }
         else{
            start=mid+1;
         }
         
      }
      return -1;
     }
}
