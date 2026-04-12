class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        int maxseq = 0;
        for(int val : set){
            if(!set.contains(val-1)){
                int curval=val;
                int curseq = 1;
                while(set.contains(curval+1)){
                    curseq++;
                    curval++;
                }
                maxseq = Math.max(maxseq,curseq);
            }
        }
        return maxseq;
    }
}