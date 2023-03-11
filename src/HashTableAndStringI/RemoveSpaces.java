package HashTableAndStringI;

public class RemoveSpaces {
    public String removeSpaces(String input) {
        char[] array = input.toCharArray();
        int i = 0, j = 0;
        while (i < array.length) {
            if (array[i] == ' ' && (i == 0 || array[i - 1] == ' ')) {
                i++;
                continue;
            }
            array[j++] = array[i];
            i++;
        }
        if (j > 0 && array[j - 1] == ' ') j--;
        return new String(array, 0, j);
    }
}
