class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);//-4,-1,-1,0,1,2
       int n=nums.length;
       List<List<Integer>> res = new ArrayList<>();
//i=-4
       for(int i=0;i<n-2;i++){
   //-1==-1
        if(i>0 && nums[i] == nums[i-1]){
            continue;
        }
           if (nums[i] > 0) {
                break;
            }
        int left=i+1;//-1
        int right=n-1;//2
     
        while(left<right){
            int sum= nums[i]+nums[left]+nums[right];//-4-1+2=-3<0
            if(sum==0){
                List<Integer> l = new ArrayList<>();
                l.add(nums[i]);
                l.add(nums[left]);
                l.add(nums[right]);
                res.add(l);
                left++;
                right--;

                while(left<right && nums[left]==nums[left-1]){
                    left++;
                }
                while(left<right && nums[right]==nums[right+1]){
                    right--;
                }
            }
            else if(sum<0){
                left++;
            }
            else{
                right--;
            }


        }
       }
         return res;
        }
      
        
    }
