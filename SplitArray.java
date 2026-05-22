public class SplitArray{
    public static void main(String[] args) {
     int[]arr={7,2,5,10,8};
     System.out.println(Splitarray(arr, 2));
    }
    static int Splitarray(int [] arr,int m){
        int start=0;
        int end=0;
        for(int i =0;i<arr.length;i++){
            start=Math.max(start,arr[i]);
            end+=arr[i];
        }
        while (start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int count=1;
            for (int num:arr){
                if(sum+num >mid){
                    sum=num;
                    count++;
                }
                else{
                    sum+=num;
                }
            }
            if(count<=m){
                end=mid;
            }
            else{
               start=mid+1;
            }


        }
        return end;
    }
}