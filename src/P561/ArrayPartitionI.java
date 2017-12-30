package P561;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayPartitionI {

    public int arrayPairSum(int[] nums) {
        ArrayList<Integer> numList = new ArrayList<>() {{
            for (int i : nums) add(i);
        }};
        Collections.sort(numList);
        int sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            sum += (i % 2 == 0 ? numList.get(i) : 0);
        }
        return sum;
    }

    public int arrayPairSumPerfect(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

}
