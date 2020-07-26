import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class ChangesInString {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int inputLength = 0;
//        String inputString;
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            inputLength = s.nextInt() - 1;
//            inputString = s.next();
//            for (int j = 0; j < lastIndexOfA(inputString); j++) {
//                if (inputString.charAt(j) == 'B') {
//                    count++;
//                }
//            }
//            System.out.println(count);
//            count = 0;
//        }
        String dateString = getDateAndTimeString(
                System.currentTimeMillis(), "yyyy-MM-dd'T'HH:mm:ss");
        System.out.println(dateString);
    }

    private static int lastIndexOfA(String string) {
        int len = string.length();
        while (len-- > 0) {
            if (string.charAt(len) == 'A') {
                return len;
            }
        }
        return 0;
    }

    public static String getDateAndTimeString(long timestamp, String pattern) {
        Date date = new Date(timestamp);
        SimpleDateFormat format = new SimpleDateFormat(pattern, Locale.ENGLISH);
        format.setTimeZone(TimeZone.getTimeZone("UTC"));
        return format.format(date);
    }
}
