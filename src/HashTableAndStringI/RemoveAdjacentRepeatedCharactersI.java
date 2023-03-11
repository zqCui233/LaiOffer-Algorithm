package HashTableAndStringI;

public class RemoveAdjacentRepeatedCharactersI {
    public String deDup(String input) {
        if (input.length() <= 1) return input;
        char[] array = input.toCharArray();
        int i = 1, j = 0;
        while (i < array.length) {
            char tmp = array[j];
            if (array[i] == array[j]) i++;
            else {
                j++;
                array[j] = array[i];
            }
        }

        return new String(array, 0, j + 1);
    }
}
