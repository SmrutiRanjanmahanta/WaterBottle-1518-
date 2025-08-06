public class Twosum{
    public static int[] twosum(int[] nums,int target){
        int[] sum=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    sum[0]=nums[i];
                    sum[1]=nums[j];
                    break;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[] nums={2,7,9,15};
        int target=9;
        
        System.out.println(twosum(nums,target));
    }
}
