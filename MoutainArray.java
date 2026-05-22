public class MoutainArray {
   public static void main(String[] args) {
       int [] arr={1,3,4,6,7,8,9,14,6,4,3,1};
       System.out.println(middle(arr));
   } 
       private static int middle(int [] nums){
        int start=0;
        int end=nums.length-1;
        while (start<end){
            int mid=start+(end-start)/2;      
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
           return end;
       }
}
