import java.util.*;

public class GroupAnagram {

    private static String[] data = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};

    public static void main(String[] args) {

        GroupAnagram anagram = new GroupAnagram();
        System.out.println(anagram.groupAnagrams(data));
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        List<String> strsCopy = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            strsCopy.add(sortString(strs[i]));
        }

        HashMap<String, List<String>> listHashMap = new HashMap<>();

        for (int i = 0; i < strsCopy.size(); i++) {
            if (listHashMap.containsKey(strsCopy.get(i))) {
                List<String> stringList = listHashMap.get(strsCopy.get(i));
                stringList.add(strs[i]);
                listHashMap.put(strsCopy.get(i), stringList);
            } else {
                List<String> stringList = new ArrayList<>();
                stringList.add(strs[i]);
                listHashMap.put(strsCopy.get(i), stringList);
            }
        }

        return new ArrayList<>(listHashMap.values());
    }

    private static String sortString(String input) {
        char[] arr = input.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
