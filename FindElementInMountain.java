public class FindElementInMountain {
    public static void main(String[] args) {
        int []nums={1,3,4,5,6,7,8,88,6,4,3,1};
        int target =88;
        System.out.println(stAed(nums, target));
    }
    private static int peak(int[] arr){
       int start=0;
       int end=arr.length-1;
       while(start<end){
        int mid=start+(end-start)/2;
        if(arr[mid]>arr[mid+1]){
           end=mid;
        }
        else{
           start=mid+1;
        }
       }
       return end;
    }
    private static int stAed(int [] arr,int target){
       int peak=peak(arr);
       int test=bitonic(arr, target,0, peak, true);
       if(test==-1) return bitonic(arr, target, peak, arr.length-1, false);
       else return test;

    }


    private  static int bitonic(int [] arr,int target,int start,int end,boolean isAssc){
      while(start<=end){
        int mid=start+(end-start)/2;
        if(arr[mid]==target) return mid;
        if(isAssc){
            if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        else{
            if(arr[mid]>target){
               start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
      }
      return -1;
    }
}
