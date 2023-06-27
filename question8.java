import java.util.Arrays;

public class RearrangeArray {
    
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length / 2;
        int[] rearranged = new int[nums.length];
        
        for (int i = 0; i < n; i++) {
            rearranged[2 * i] = nums[i];
            rearranged[2 * i + 1] = nums[i + n];
        }
        
        return rearranged;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        
        int[] rearrangedArray = rearrangeArray(nums);
        
        System.out.println("Rearranged Array: " + Arrays.toString(rearrangedArray));
    }
}
