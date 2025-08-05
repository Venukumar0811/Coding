import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> combination, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(combination)); 
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            int current = candidates[i];
            if (current > target) continue; 

            combination.add(current); 
            backtrack(candidates, target - current, i, combination, result);
            combination.remove(combination.size() - 1); 
        }
    }
}
