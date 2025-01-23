class Solution {
    public int function(int[] nums,int mid){
        int sum1=0;
        int m1=1;
        for(int i=0;i<nums.length;i++){
            sum1=sum1+nums[i];
            if(sum1>mid){
                m1++;
                sum1=nums[i];
            }
        }
        return m1;
    }
    public int splitArray(int[] nums, int k) {
        int n=nums.length-1;
        int val=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+nums[i];
            val=Math.max(val,nums[i]);
        }
        int left=val;
        int right=sum;
        while(left<=right){
            int mid=(left+right)/2;
            int value=function(nums,mid);
            if(value>k){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return left;
        
    }
}