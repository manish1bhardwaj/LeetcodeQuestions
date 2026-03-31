class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int ele : nums){
            if(ele % 2 == 0){
                if(!map.containsKey(ele)){
                    map.put(ele,1);
                }
                else{
                    map.put(ele, map.getOrDefault(ele,0) + 1);
                }
            }
        }

        int max_freq = 0, ans_key = -1;

        for(var e : map.entrySet()){
            int key = e.getKey();
            int freq = e.getValue();

            if(freq > max_freq){
                max_freq = freq;
                ans_key = key;
            }
            else if(freq == max_freq){
                ans_key = Math.min(ans_key, key);
            }
        }

        return ans_key;
    }
}