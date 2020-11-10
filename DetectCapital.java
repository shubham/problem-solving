public class DetectCapital {
    public static void main(String[] args) {
        System.out.println(6/2);
        DetectCapital detectCapital = new DetectCapital();
        System.out.println(detectCapital.detectCapitalUse("USA"));
//        Math.ab
    }

    public boolean detectCapitalUse(String word) {
        int count = 0;
        int bigCount = 0;
        char[] words = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if (words[i] >= 'A' && words[i] <= 'Z')
                bigCount++;
            else if (words[i] >= 'a' && words[i] <= 'z')
                count++;
        }
        System.out.println("BigCount:" + bigCount + " Count:" + count);

        if (bigCount == words.length || count == words.length)
            return true;
        else {
            return (words[0] >= 'A' && words[0] <= 'Z') && count == words.length - 1;
        }
    }
}