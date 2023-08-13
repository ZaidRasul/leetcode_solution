import java.util.Arrays;


public class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        Arrays.sort(height);



return height[n]*height[n-1];
    }
}
