class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            int freq = 1;

            boolean visited = false;
            for(int v = 0;v<i;v++){
                if(nums[i]==nums[v]){
                    visited= true;
                }
            }
            if(visited) continue;
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    freq++;
                }
            }
            if(freq==1){
                sum+=nums[i];
            }
        }
        return sum;
    }
}