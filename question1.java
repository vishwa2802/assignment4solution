
import java.util.ArrayList;
import java.util.List;

public class CommonElementsInThreeArrays {

    public static List<Integer> findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> result = new ArrayList<>();

        int ptr1 = 0, ptr2 = 0, ptr3 = 0;

        while (ptr1 < arr1.length && ptr2 < arr2.length && ptr3 < arr3.length) {
            if (arr1[ptr1] == arr2[ptr2] && arr2[ptr2] == arr3[ptr3]) {
                result.add(arr1[ptr1]);
                ptr1++;
                ptr2++;
                ptr3++;
            } else if (arr1[ptr1] <= arr2[ptr2] && arr1[ptr1] <= arr3[ptr3]) {
                ptr1++;
            } else if (arr2[ptr2] <= arr1[ptr1] && arr2[ptr2] <= arr3[ptr3]) {
                ptr2++;
            } else {
                ptr3++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2,3,4,5};
        int[] arr2 = {1, 2, 5,7,9};
        int[] arr3 = {1, 3,4,5,8};

        List<Integer> commonElements = findCommonElements(arr1, arr2, arr3);

        System.out.println("Common elements: " + commonElements);
    }
}
