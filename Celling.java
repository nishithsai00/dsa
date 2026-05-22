public class Celling {
    public static void main(String[] args) {
        int [] arr={1,2,4,6,8,10,14,18,20,68};
        System.out.println(cellingofnum(arr,17));
    }

    private static int cellingofnum(int[] arr, int i) {
      int start=0;
      int end=arr.length-1;
      int ans=-1;
      while(start<end){
        int mid=start+(end-start)/2;
        if(arr[mid]==i){
            return mid;}
            else if(arr[mid]>i){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
      } 
      return arr[ans];
    }
}
