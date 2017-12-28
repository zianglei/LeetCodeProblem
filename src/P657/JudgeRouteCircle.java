/**
 * @link https://leetcode.com/problems/judge-route-circle/description/
 */

package P657;

public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'U') x += 1;
            if (c == 'D') x -= 1;
            if (c == 'L') y -= 1;
            if (c == 'R') y += 1;
        }
        return x == 0 && y == 0;
    }

    public boolean judgeCirclePerfect(String moves){
        // 统计moves中U,D,L,R的个数
        // 直接寻找数组中的元素
        int count[] = new int[128];
        for (char c: moves.toCharArray()){
            count[c] ++;
        }
        return count['U'] == count['D'] && count['L'] == count['R'];
    }
}
