/**
 * @href https://leetcode.com/problems/self-dividing-numbers/description/
 */
package P728;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++){
            int temp = i;
            while(temp != 0){
                int num = temp % 10;
                if (num == 0) break;
                if (i % num == 0){
                    temp = temp / 10;
                } else{
                    break;
                }
            }
            if(temp == 0) list.add(i);
        }
        return list;
    }

    // 顺序提取数字某一位: num = temp % 10
    public static List<Integer> selfDividingNumbersPerfect(int left, int right){
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i ++){
            int temp = i;
            // for循环有时候可以起到while的作用，在for循环的第三段可以执行一些操作
            for (; temp > 0; temp /= 10){
                if (temp % 10 == 0 || i % (temp % 10) != 0) break;
            }
            if (temp == 0) list.add(i);
        }
        return list;
    }

    public static void main(String[] args){
        //List<Integer> result = selfDividingNumbers(1, 22);
        List<Integer> result = selfDividingNumbersPerfect(1, 22);
        System.out.print(result.toString());
    }
}
