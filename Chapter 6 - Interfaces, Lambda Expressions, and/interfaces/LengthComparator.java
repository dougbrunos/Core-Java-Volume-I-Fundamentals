package interfaces;

import java.util.Arrays;
import java.util.Comparator;

public class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String first, String second) {
        return first.length() - second.length();
    }

    public static void main(String[] args) {

        String[] words = { "Douglas", "Test", "Core" };

        var comp = new LengthComparator();

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
                if (comp.compare(words[j], words[j + 1]) > 0) {
                    // troca
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        // Or simple

        String[] friends = { "Peter", "Paul", "Mary" };
        Arrays.sort(friends, new LengthComparator());
        for (int i = 0; i < friends.length; i++) {
            System.out.println(friends[i]);
        }

    }

}