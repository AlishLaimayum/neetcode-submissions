class Solution {
    List<List<Integer>> solution = new ArrayList<>();

    public void backTrack(
        int[] candidates,
        int target,
        int index,
        List<Integer> curr
    ) {
        if (target == 0) {
            solution.add(new ArrayList<>(curr));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (candidates[i] > target) {
                break;
            }
            curr.add(candidates[i]);

            backTrack(candidates,target - candidates[i],i + 1,curr);

            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        backTrack(candidates, target, 0, new ArrayList<>());

        return solution;
    }
}