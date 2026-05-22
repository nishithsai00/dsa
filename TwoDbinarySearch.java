import java.util.Arrays;

public class TwoDbinarySearch {
    public static void main(String[] args) {
      int arr[][]={{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
      System.out.println(Arrays.toString(binarySearch(arr, 50)));
    }
    private static int [] binarySearch(int arr[][],int target){
         int row=0;
         int col=arr.length-1;
         while(row<arr.length&&col>=0){
         if(arr[col][row]==target){
             return new int[]{col,row};
         }
         if(arr[col][row]>target){
      col--;
         }
         else{
          row++;
         }
            
         
    }
    return new int[] {-1,-1};
}
}