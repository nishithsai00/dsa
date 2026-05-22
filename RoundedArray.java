public class RoundedArray {
    public static void main(String[] args) {
        int [] arr={4,5,6,7,8,9,10,11,0,1,2,3};
        int target=11;
        int [] nums={10};
        // System.out.println(startAend(nums, target));
        System.out.println(piviotBinarySearch(arr, target));
        
    }

    private static int middle(int[] arr) {
       int start=0;
       int end=arr.length-1;
       while(start<end){
        int mid=start+(end-start)/2;
        if(mid<end&&arr[mid]>arr[mid+1]){
        return mid;
        }
        if(start<mid &&arr[mid-1]>arr[mid]){
      return mid-1;
        }
            if(arr[start]>arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
       return -1;


    }
    private static int piviotBinarySearch(int [] arr,int target){
      int pivoit=middle(arr);
if(pivoit ==-1){
    return binarySearch(arr, target, 0, arr.length-1);
}
    if(target==arr[pivoit]){
        return pivoit;
      }
    if(arr[0]<=target){
        return binarySearch(arr, target, 0, pivoit);
     }
    else{
        return binarySearch(arr, target,pivoit+1,arr.length-1);
     }


    }
      private static int binarySearch(int [] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
          if(arr[mid]>target){
              end=mid-1;
          }
          else if(arr[mid]<target){
            start=mid+1;
          }
          else{
            return mid;
          }
        }
        return -1;
      }
}

