# LeetCodeProblem
LeetCode刷题代码记录

## Easy难度
### 617 Merge Two Binary Trees
[题目描述](https://leetcode.com/problems/merge-two-binary-trees/description/)

想法：先判断t1 和 t2 是否是null，如果某个是null，返回另一个；如果两个都不是null，
创建新的TreeNode，节点值为t1.val + t2.val，通过迭代得到左子树和右子树

### 657 Judge Route Circle
[题目描述](https://leetcode.com/problems/judge-route-circle/description/)

自己想法：通过读取依次读取字符串来判断最终坐标是否和起始坐标相同

最佳想法：通过判断指令字符串中“U”和“D”数目以及“L”和“R”数目是否相同来判断是否回到原点

### 728 SelfDividingNumbers
[题目描述](https://leetcode.com/problems/self-dividing-numbers/description/)

 想法：通过依次求余和整除10得到每一位数字，判断是否为0和能否整除原整数
 
 收获：for循环在一些情况下能够代替while，使代码更简便
 
 ### 561 Array Partition I
 [题目描述](https://leetcode.com/problems/array-partition-i/description/)
 
 想法：将数组进行排序，然后从第一个开始每隔一个进行求和
 
 收获：  
 Java中对数组进行排序可以使用Arrays.sort()，默认升序排序；</br>
 Kotlin中sumBy函数：在每个集合元素上应用一个函数，返回所有这个函数返回的结果相加一起的值。</br>
 1..num 代表范围\[1,num\] </br>
 1..num-1 可以使用1 until num
                
                
            