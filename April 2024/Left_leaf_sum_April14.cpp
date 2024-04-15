// Input: root = [3,9,20,null,null,15,7]
// Output: 24
// Explanation: There are two left leaves in the binary tree, with values 9 and //15 respectively.

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {} // constructor
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution
{
public:
    int sumOfLeftLeaves(TreeNode *root)
    {
        if (root == nullptr)
        {
            return 0;
        }
        int sum = 0;
        if (root->left != nullptr && root->left->left == nullptr && root->left->right == nullptr)
        {
            sum += root->left->val; // Add the value of left leaf node
        }
        sum += sumOfLeftLeaves(root->left);  // Recursively traverse left subtree
        sum += sumOfLeftLeaves(root->right); // Recursively traverse right subtree
        return sum;
    }
};
