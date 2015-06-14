# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} root
# @return {TreeNode}
def invert_tree(root)
    return root if root.nil?

    temp = root.left
    root.left = root.right
    root.right = temp

    invert_tree(root.left) unless root.left.nil?
    invert_tree(root.right) unless root.right.nil?

    root
end