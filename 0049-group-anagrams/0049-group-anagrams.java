class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

    HashMap<String ,List<String>> map = new HashMap<>();

    for(String str:strs){

        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String key =new String(ch);

        if(!map.containsKey(key)){
              map.put(key,new ArrayList<>());
        }
         map.get(key).add(str);// Get the list associated with the sorted string (key) and add the current word to that list
    }

    return new ArrayList<>(map.values());

           
    }
}