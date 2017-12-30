package P561

import java.util.*

class Solution {
    fun arrayPariSum(nums: IntArray): Int {
        nums.sort()
        return (0 until nums.size step 2).sumBy { nums[it] }
    }
}
