class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character,Integer> map = new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }

        for(char ch :s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for(char c :t.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);

            }else{
                return false;
            }

        }
        for(int values:map.values()){
            if(values!=0){
                return false;
            }
        }
        return true;
    }
}