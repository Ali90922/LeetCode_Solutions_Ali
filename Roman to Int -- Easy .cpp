#include <iostream>
#include <string>

class Solution
{
public:
    int romanToInt(std::string s)
    {
        int result = 0;          // Variable to store the final result
        int length = s.length(); // Length of the input string

        // Iterate through each character in the string
        for (int i = 0; i < length; ++i)
        {
            int current = value(s[i]);
            int next = (i < length - 1) ? value(s[i + 1]) : 0;

            // If the current value is less than the next value, subtract it
            if (current < next)
            {
                result -= current;
            }
            else
            {
                // Otherwise, add the current value
                result += current;
            }
        }

        return result; // Return the final result
    }

private:
    int value(char c)
    {
        // Switch case to return the value of the Roman numeral character
        switch (c)
        {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        default:
            return 0; // Default case, should never hit for valid input
        }
    }
};
