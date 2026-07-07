//Hashing medium question
//49-Group Anagrams

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();
        for(String str : strs){
            String sorted = sort(str);
            map.computeIfAbsent(sorted , k -> new ArrayList()).add(str);
        }
        return new ArrayList<>(map.values());
    }

  //helpur fuct for sorting the words 
    private String sort(String word){
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String (chars);
    }
}
