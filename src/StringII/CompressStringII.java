package StringII;

public class CompressStringII {
    public String compress(String input) {
        char[] array = input.toCharArray();
        int i = 0, j = 0, len = 0;
        while (j < array.length) {
            int begin = j;
            while (j < array.length && array[j] == array[begin]) {
                j++;
            }
            array[i++] = array[begin];
            if (j - begin == 1) {
                len += 2;
            } else {
                int diff = addCount(array, i, j - begin);
                len += diff + 1;
                i += diff;
            }
        }

        char[] res = new char[len];
        j = i - 1;
        i = res.length - 1;

        while (j >= 0) {
            if (Character.isDigit(array[j])) {
                while (j >= 0 && Character.isDigit(array[j])) {
                    res[i--] = array[j--];
                }
            } else {
                res[i--] = '1';
            }
            res[i--] = array[j--];
        }

        return new String(res);
    }

    private int addCount(char[] array, int index, int count) {
        int len = 0;
        for (int i = count; i > 0; i /= 10) {
            index++;
            len++;
        }

        for (int i = count; i > 0; i /= 10) {
            int digit = i % 10;
            array[--index] = (char) ('0' + digit);
        }

        return len;
    }

    public static void main(String[] args) {
        String s = "ab";
        System.out.println(new CompressStringII().compress(s));
    }
}
