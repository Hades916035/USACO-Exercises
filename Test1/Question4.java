import java.util.ArrayList;
import java.util.List;

public class Question4 {

    public static List<List<Integer>> findSubsets(List<Integer> nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), subsets);
        return subsets;
    }

    private static void generateSubsets(int index, List<Integer> nums, List<Integer> current, List<List<Integer>> subsets) {
        if (index == nums.size()) {
            subsets.add(new ArrayList<>(current));
            return;
        }

        generateSubsets(index + 1, nums, current, subsets);

        current.add(nums.get(index));
        generateSubsets(index + 1, nums, current, subsets);
        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3); //add whatev nums here
        List<List<Integer>> result = findSubsets(nums);
        System.out.println(result);
    }
}