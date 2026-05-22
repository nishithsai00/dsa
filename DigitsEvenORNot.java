public class DigitsEvenORNot {
    public static void main(String args[])
    {
        int [] target ={1,2777,455,6654};
        int count=0;
        for (int i:target)
        {
            if(iseven(i))
            {
                count++;
            }

        }
        //System.out.println(count);
                
         int [][] dd={
            {1,3343,22,2,23}
            ,{3,34,23,44,4}
            ,{1,3,44,32,11,12}
         };
         System.out.println(max(dd));



    }
        
    static int max(int[][] arr)
    { int max=Integer.MIN_VALUE;
      for(int c=0;c<arr.length;c++)
        {
           for(int d=0;d<arr[c].length;d++){
              if(arr[c][d]>max)
                max=arr[c][d];

           }
           }
           return max;
    }





    private static boolean iseven(int i) {
        return kk(i)%2==0;
    }
    private static int kk(int o)
    {
         return (int)(Math.log10(o)+1);
    }
}