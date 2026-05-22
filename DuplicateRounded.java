public class DuplicateRounded {
    public static void main(String[] args) {
         int arr[]={5,5,6,6,7,8,8,8,8,8,8,9,0,1,2,3};
         int target=5;
         System.out.println(pivotBinarySearch(arr, target));
    }
   
    public static int pivot(int arr[]){
       int start=0;
       int end=arr.length-1;
       while(start<end){
        int mid=start+(end-start)/2;
        if(mid<end &&arr[mid]>arr[mid+1]){
            return mid;
        }
        if(start<mid && arr[mid-1]>arr[mid]){
            return mid-1;
        }
        if(arr[start]==arr[mid]&&arr[mid]==arr[end]){
            if(arr[start]>arr[start+1]){
                return start;
            }
            start++;

            if(arr[end-1]>arr[end]){
                return end-1;
            }
            end--;
        }
        else if(arr[start]<arr[mid] ||(arr[start]==arr[mid]&&arr[mid]>arr[end])){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
       }
       return -1;
    }
    private static int pivotBinarySearch(int [] arr,int target){
      int pivot=pivot(arr);
      if(pivot==-1){
        return binarySearch(arr, target, 0, arr.length-1);
      }
      if (target>=arr[0]) {
          return binarySearch(arr, target, 0, pivot);
      }
      else{
        return binarySearch(arr, target, pivot+1, arr.length-1);
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

