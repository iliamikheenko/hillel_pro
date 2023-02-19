package main.java;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChecker {
    public boolean containsDuplicate(int[] nums) {
        //the fastest solution I found
        Set<Integer> unique = new HashSet<>();
        for (int number : nums) {
            if (!unique.add(number)) return true;
        }
        return false;

        //the shortest solution
        // return nums.length != Arrays.stream(nums).distinct().count();
    }
}
