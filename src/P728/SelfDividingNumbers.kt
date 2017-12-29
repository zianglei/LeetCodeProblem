/**
 * @href https://leetcode.com/problems/self-dividing-numbers/description/
 */
package P728

class Solution {
    fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        val d = mutableListOf<Int>()
        for ( i in left..right+1){
            var temp = i
            loop@ while (temp > 0){
                when{
                    temp % 10 != 0 && i % (temp % 10) == 0 -> temp /= 10
                    else -> break@loop
                 }
            }
            if ( temp == 0) d.add(i)
        }
        return d
    }
}

fun main(args: Array<String>){
    println(Solution().selfDividingNumbers(1, 22));
}