class Solution { 
    public List<List<String>> groupAnagrams(String[] strs) {
    Map<String,List<String>>map = new HashMap<>();

    //traversing on strs by for each
    for(String word : strs){
        char[]chars = word.toCharArray();
        Arrays.sort(chars);

        //create a key
        String key = new String(chars);
        map.computeIfAbsent(key , k -> new ArrayList<>()).add(word);
    }
    return new ArrayList<>(map.values());
    }
}
