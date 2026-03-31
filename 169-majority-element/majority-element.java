class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:nums){
            if(!map.containsKey(ele)){
                map.put(ele,1);
            }
            else{
                map.put(ele,map.get(ele)+1);
            }
        }
        int max_freq = 0, ans_key = -1;
        for(var e:map.entrySet()){
            if(e.getValue()>max_freq){
                max_freq = e.getValue();
                ans_key= e.getKey();
            }
        }
        return ans_key;
    }
}