# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

import math


class TreeNode:

    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:

    @staticmethod
    def createTree(ary) -> TreeNode:

        treenode = []
        for elem in ary:
            treenode.append(TreeNode(elem))

        aryLen = len(ary)
        hierarchy = aryLen / 2 - 1

        for index in range(math.ceil(hierarchy)):
            treenode[index].left = treenode[index * 2 + 1]
            treenode[index].right = treenode[index * 2 + 2]

        hierarchy = math.floor(hierarchy)
        treenode[hierarchy].left = treenode[hierarchy * 2 + 1]
        if aryLen % 2 == 1:
            treenode[hierarchy].right = treenode[hierarchy * 2 + 2]

        return treenode[0]

    def mergeTrees(self, t1: TreeNode, t2: TreeNode) -> TreeNode:

        if t1 is not None and t2 is not None:

            node = TreeNode(t1.val + t2.val)
            node.left = self.mergeTrees(t1.left, t2.left)
            node.right = self.mergeTrees(t1.right, t2.right)

            return node
        elif t1 is None:
            return t2
        elif t2 is None:
            return t1


ary1 = [1, 3, 2, 5]
ary2 = [2, 1, 3, 8, 4, 6, 7]

sol = Solution()
t1 = sol.createTree(ary1)
t2 = sol.createTree(ary2)
print(sol.mergeTrees(t1, t2))
