// Max Water Container Problem -- Attempted Aug 8 -- Rated Medium
#include <vector>
#include <algorithm> // for std::min, std::max
#include <iostream>  // for std::cout

class Solution
{
public:
    int maxArea(std::vector<int> &height)
    {
        int maxArea = 0;               // Initialize maxArea to zero
        int left = 0;                  // Start pointer
        int right = height.size() - 1; // End pointer

        while (left < right)
        {
            // Calculate the area
            int width = right - left;
            int minHeight = std::min(height[left], height[right]);
            int area = width * minHeight;
            maxArea = std::max(maxArea, area);

            // Move the pointers
            if (height[left] < height[right])
            {
                ++left;
            }
            else
            {
                --right;
            }
        }
        return maxArea;
    }
};
