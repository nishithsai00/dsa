import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstAndLastOccurance{
public static void main(String[] args) {
int [] arr={1,2,4,5,7,7,7,7,9,11};
int target=7;

System.out.println(Arrays.toString(firstAlast(first(arr,target),last(arr,target))));
}

static int  first(int[] arr,int target){
    int start=0;
    int end=arr.length-1;
    int ans=-1;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(arr[mid]>=target){
            if(arr[mid]==target){ans=mid;}
            end=mid-1;
            }
        else{
            start=mid+1;
        }

    }
    return ans;
}




    static int last(int[] arr ,int target){
    int start=0;
    int  end=arr.length-1;
     int ans=-1;
    while(start<=end){
         
      int mid=start+(end-start)/2;
    
      if(arr[mid]<=target){
        if(arr[mid]==target){ans=mid;}
        start=mid+1;
      }
      else{
        end=mid-1;
      }
    }
    return ans;
}

    private static int[] firstAlast(int first,int last) {
        return new int [] {first,last};
    }

}