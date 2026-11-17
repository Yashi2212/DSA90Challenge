class Solution {
    public int searchInsert(int[] nums, int target) {
       //1,2,5,6
       int left=0;
       int right =nums.length -1;
       int mid=0,guess=0;
       while(left<=right){
        mid=(left+right)/2;
        guess=nums[mid];
        if(target==guess){
            return mid;
        }
        else if(guess<target){
            left = mid + 1;
        }
        else{
            right=mid-1;
        }
       }
       return left;
    }
}