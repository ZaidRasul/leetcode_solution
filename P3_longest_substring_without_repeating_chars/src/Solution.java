class Solution {
    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0;
        for(int i=0; i<s.length(); i++)
        {
            StringBuilder currentSubstring = new StringBuilder();
            for (int j = i; j < s.length() ; j++)
            {
                if (currentSubstring.indexOf(String.valueOf(s.charAt(j))) != -1)
                {
                    break;
                }
                currentSubstring.append(s.charAt(j));
                if (currentSubstring.length() > maxLength)
                {
                    maxLength = currentSubstring.length();
                }

            }
        }
        return maxLength;

    }
}
