package Chapter1;

import java.util.HashSet;
import java.util.Set;

public class _1_IsUnique {

    /**
     * Implement and algorithm to determine if a string has all
     * unique characters. What if you cannot use additional data structures?
     */

    /**
     * Here we can utilize the functionality of a HashSet, we know that a set
     * can only contain unique characters so if we take our string and put it
     * into a set we will have a set that is purely unique. Now all we have to
     * do is check the size of the set agains the original strings length. If
     * the set is smaller that means we tried to add a letter that was already
     * in there so it doesn't get added in make our set size 1 char smaller than
     * our original string, and so on for the rest of the string;
     *
     * Runtime: insertion into a set is constant O(1)
     * Thus our final runtime is O(1)
     */
    public boolean isUnique(String value) {
        Set<Character> set = new HashSet<Character>();
        for (char c : value.toCharArray()) {
            set.add(c);
        }
        return set.size() == value.length();
    }
}
