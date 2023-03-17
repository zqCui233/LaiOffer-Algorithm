package StringII;

public class DecompressStringII {
    public String decompress(String input) {
        if (input.isEmpty()) return input;
        char[] array = input.toCharArray();
        int len = array.length;
        for (char c : array) {
            if (Character.isDigit(c)) {
                len += c - '0' - 2;
            }
        }

        char[] res = new char[len];
        int index = 0;

        for (int i = 0; i < array.length; i += 2) {
            char cur = array[i];
            int count = array[i + 1] - '0';
            for (int j = 0; j < count; j++) {
                res[index++] = cur;
            }
        }
        return new String(res);
    }

}
