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
