public class problem20 {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        
        String temp = s + s;
        return temp.contains(goal);
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String goal1 = "cdeab";
        System.out.println(rotateString(s1, goal1)); // true

        String s2 = "abcde";
        String goal2 = "abced";
        System.out.println(rotateString(s2, goal2)); // false
    }
}