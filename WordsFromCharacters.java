import java.util.HashMap;

public class WordsFromCharacters {
    public static void main(String[] args) {
        WordsFromCharacters characters = new WordsFromCharacters();
        System.out.println("characters = "
                + characters.countCharacters(new String[]{
                        "cat", "bt", "hat", "tree"
                },
                "atach"));
    }

    public int countCharacters(String[] words, String chars) {
        int count = 0;
        HashMap<Character, Integer> charsCount = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            charsCount.put(chars.charAt(i), charsCount.getOrDefault(chars.charAt(i), 0) + 1);
        }
        System.out.println("character = " + charsCount.keySet() + " values = " + charsCount.entrySet());
        for (String word : words) {
            System.out.println("word = " + word);
            boolean canBeForm = true;
            HashMap<Character, Integer> copyCharsCount = (HashMap<Character, Integer>) charsCount.clone();
            System.out.println("copyCharsCount character = " + copyCharsCount.keySet() + " values = " + copyCharsCount.entrySet());
            for (char c: word.toCharArray()) {
                System.out.println("word = " + c);
                if (!copyCharsCount.containsKey(c)) {
                    canBeForm = false;
                    break;
                }
                int n = copyCharsCount.get(c);
                if (n == 1) {
                    copyCharsCount.remove(c);
                } else
                    copyCharsCount.put(c, n - 1);
                System.out.println("copyCharsCount character = " + copyCharsCount.keySet() + " values = " + copyCharsCount.entrySet());
            }
            System.out.println(" canBeForm = " + canBeForm);
            if (canBeForm)
                count += word.length();
            System.out.println("count = " + count);
        }
        return count;
    }
}
