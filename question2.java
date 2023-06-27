import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctIntegers {
    
    public static List<List<Integer>> findDistinctIntegers(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        
        for (int num : nums2) {
            set2.add(num);
        }
        
        List<Integer> distinctInNums1 = new ArrayList<>();
        List<Integer> distinctInNums2 = new ArrayList<>();
        
        for (int num : nums1) {
            if (!set2.contains(num)) {
                distinctInNums1.add(num);
            }
        }
        
        for (int num : nums2) {
            if (!set1.contains(num)) {
                distinctInNums2.add(num);
            }
        }
        
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(distinctInNums1);
        answer.add(distinctInNums2);
        
        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        
        List<List<Integer>> distinctIntegers = findDistinctIntegers(nums1, nums2);
        
        System.out.println("Distinct integers in nums1 but not in nums2: " + distinctIntegers.get(0));
        System.out.println("Distinct integers in nums2 but not in nums1: " + distinctIntegers.get(1));
    }
}
