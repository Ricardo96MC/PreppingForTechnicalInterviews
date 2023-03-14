package Chapter1;

import java.util.HashMap;

public class _2_CheckPermutations {
    /**
     * Given two strings identify if they are permutations of one another
     */

    /**
     * 
     * We can approach this two ways, here we are going to put the strigns
     * into two hashmaps and do an equlaity check
     * Run time: O(n)
     */
    public boolean isPermutation(String str1, String str2) {
        // 1st check cases
        if (str1.length() != str2.length())
            return false;

        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

        for (Character c : str1.toCharArray()) {
            if (!map1.containsKey(c))
                map1.put(c, 1);
            else {
                map1.put(c, map1.get(c) + 1);
            }
        }

        for (Character c : str2.toCharArray()) {
            if (!map2.containsKey(c))
                map2.put(c, 1);
            else {
                map2.put(c, map2.get(c) + 1);
            }
        }

        return map1.equals(map2);
    }

    /**
     * 
     * The other way is, we are goin tp put the strings into an array,
     * sort them and then compare the arrays. here our runtime is a longer
     * as we are sorting the array which is the bottleneck of our algorithm;
     *
     * Run time: O(n log n)
     */

    public boolean isPermutationSort(String str1, String str2) {

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }

        return true;
    }
}
