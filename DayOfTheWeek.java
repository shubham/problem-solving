/**
 * Problem Link :
 * https://leetcode.com/problems/day-of-the-week/
 * <p>
 * for problem description go to Above link
 */
public class DayOfTheWeek {
    public static void main(String[] args) {
        DayOfTheWeek day = new DayOfTheWeek();
        System.out.println("day = " + day.dayOfTheWeek(15, 8, 1993));
    }

    public String dayOfTheWeek(int day, int month, int year) {
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] t = new int[]{0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (month < 3)
            year = year - 1;
        return weekDays[(year + (year / 4) - (year / 100) + (year / 400) + t[month - 1] + day) % 7];
    }
}
