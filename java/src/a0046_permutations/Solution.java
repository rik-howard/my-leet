package a0046_permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private List <List <Integer>> permutations = new ArrayList <> ();

    List <List <Integer>> permute (int [] nums) {
        return solution (nums);
    }

    private List <List <Integer>> solution (int [] nums) {
        permute (nums.length, nums, new ArrayList <> ());
        return permutations;
    }

    private void permute (int length, int [] symbols, List <Integer> permutation) {
        if (length == 0) {
            permutations.add (permutation);
        } else {
            for (Integer integer: symbols) {
                if (!permutation.contains (integer)) {
                    List <Integer> newPermutation = new ArrayList <> (permutation);
                    newPermutation.add (integer);
                    permute (length - 1, symbols, newPermutation);
                }
            }
        }
    }

}
