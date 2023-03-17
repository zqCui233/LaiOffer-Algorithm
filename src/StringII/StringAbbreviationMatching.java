package StringII;

public class StringAbbreviationMatching {
    public boolean match(String input, String pattern) {
        int i = 0, j = 0;
        while (i < input.length() && j < pattern.length()) {
            if (!Character.isDigit(pattern.charAt(j))) {
                if (input.charAt(i) != pattern.charAt(j)) return false;
                i++;
                j++;
            } else {
                int count = 0;
                while (j < pattern.length() && Character.isDigit(pattern.charAt(j))) {
                    count = 10 * count + pattern.charAt(j) - '0';
                    j++;
                }
                i += count;
            }
        }
        return i == input.length() && j == pattern.length();
    }

    public static void main(String[] args) {
        String input = "laioffercom";
        String pattern = "5fer3";
        System.out.println(new StringAbbreviationMatching().match(input, pattern));
    }
}
