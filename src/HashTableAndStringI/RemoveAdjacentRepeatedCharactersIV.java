package HashTableAndStringI;

public class RemoveAdjacentRepeatedCharactersIV {
    public String deDup(String input) {
        if (input == null || input.length() <= 1) return input;
        char[] array = input.toCharArray();
        int topIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (topIndex == - 1 || array[topIndex] != array[i]) array[++topIndex] = array[i];
            else {
                topIndex--;
                while (i + 1 < array.length && array[i] == array[i + 1]) i++;
            }
        }

        return new String(array, 0, topIndex + 1);
    }

}
