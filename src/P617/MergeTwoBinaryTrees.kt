package P617

/**
 * @link https://leetcode.com/problems/merge-two-binary-trees/description/
 */

class TreeNode(var `val`: Int = 0){
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun mergeTrees(t1: TreeNode?, t2: TreeNode?): TreeNode? {
        // merge t2 to t1
        // judge null
        var tree: TreeNode? = t1
        if (tree == null ) {
            tree = t2
        } else {
            tree.`val` = tree.`val` + (t2?.`val` ?: 0)
        }
        tree?.left = mergeTrees(t1?.left,  t2?.left)
        tree?.right = mergeTrees(t1?.right, t2?.right)
        return tree
    }

    fun mergeTreesPerfect(t1: TreeNode?, t2: TreeNode?) : TreeNode? {
        if (t1 == null) return t2
        if (t2 == null) return t1
        val mergedTree = TreeNode(t1.`val` + t2.`val`)
        mergedTree.left = mergeTreesPerfect(t1.left, t1.left)
        mergedTree.right = mergeTreesPerfect(t1.right, t2.right)
        return mergedTree
    }
}



fun main(args: Array<String>){

}