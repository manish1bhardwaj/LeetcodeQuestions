class Solution {
    static HashMap<Character,Integer> FreqMap(String str){
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i = 0;i<str.length();i++){
            Character ch = str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else{
                mp.put(ch,mp.getOrDefault(ch,0)+1);
            }
        }
        return mp;
    }



    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer> mp1 =  FreqMap(s);
        HashMap<Character,Integer> mp2 =  FreqMap(t);
        return mp1.equals(mp2);
    }
}