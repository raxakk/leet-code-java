public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int i = 0;
        StringBuilder prefix = new StringBuilder();
        charLoop:
        while (true) {
            char current = 0;
            for (var str : strs) {
                if (i >= str.length()) {
                    break charLoop;
                }
                if (current == 0) {
                    current = str.charAt(i);
                } else if (current != str.charAt(i)) {
                    break charLoop;
                }
            }
            prefix.append(current);
            i++;
        }
        return prefix.toString();
    }
}
