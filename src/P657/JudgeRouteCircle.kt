/**
 * @link https://leetcode.com/problems/judge-route-circle/description/
 */
package P657

class solution{
    fun judgeCircle(moves: String): Boolean {
        var x = 0
        var y = 0
        moves.forEach {
            when(it) {
                'L' -> x -= 1
                'R' -> x += 1
                'U' -> y += 1
                'D' -> y -= 1
            }
        }
        return x == 0 && y == 0
    }

}

fun main(args: Array<String>){
    solution().judgeCircle("LL")
}