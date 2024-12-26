import java.util.*;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int max = -1;
        int[] pointer = {0, height.length-1};

        while(pointer[0] < pointer[1]) {
            int area = (pointer[1] - pointer[0]) * Math.min(height[pointer[1]], height[pointer[0]]);
            max = Math.max(area, max);
            if(height[pointer[1]] < height[pointer[0]]) {
                pointer[1]--;
            } else {
                pointer[0]++;
            }
        }

        return max;
    }
}