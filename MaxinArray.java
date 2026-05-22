
import java.util.Arrays;

public class MaxinArray
{
    public static void main(String[] args) {
        int[][] arr={
            {1,34,33,21,11}
            ,{32,43,356,6,6}
            ,{23,4,4,5,66,43}
            
        };
     
        System.out.println(max(arr));
        System.out.println(Arrays.toString(loc(arr,43)));
    }
    static int max(int[][] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i[]:arr)
        {
            for(int j :i)
            {
                if(max<j)
                    max=j;
                
            } 
        }
        return max;
    }
    static int[] loc(int[][] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                    return new int[]{i,j};
               
            }
        }
       return new int[]{-1,-1};
    }
}