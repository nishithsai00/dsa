public class BinarySearch {
    public static void main(String[] args) {
    int[] arr={0,2,3,5,7,9,10,53,89,90};
    int[] arr2={90,89,53,10,9,7,5,3,2,0};
    int target=53;
    System.out.println(find(arr,target));   
    
    }

    private static int find(int arr[],int target){
       int start=0;
       int end=arr.length-1;
       while(start<=end)
       {
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        boolean acc=arr[start]<arr[end];
        if(acc)
        {
        if(target<arr[mid]){
            end = mid-1;
        }
        else {
            start = mid+1;
        }
        }
        else{
            if(target<arr[mid]){
                 start = mid+1;
        }
            else {
                end = mid-1;
        }
        }
        
        
    }
     return -1;

    }
   
}
