import java.util.HashMap;
import java.util.Map;

public class FasterSolution {
    public int lengthOfLongestSubstring(String s){
        int maxLen = 0;
        Map <Character, Integer> checkedChar = new HashMap<>();
        int left = 0;

        for(int right = 0 ; right < s.length(); right++){
            char currentChar = s.charAt(right);
            if(checkedChar.containsKey(currentChar) && checkedChar.get(currentChar) >= left )
            {
                left = checkedChar.get(currentChar) + 1;

            }
            maxLen = Math.max(maxLen, right - left + 1);
            checkedChar.put(currentChar,right);

        }
        return maxLen;
    }
}
