public class CountRotation {
    public static void main(String[] args) {
        int[] arr={4,5,6,8,9,1,2,3};
        int[]arr2={4,5,6,7,1,2,3};
        System.out.println(middle(arr)+1);
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
}
