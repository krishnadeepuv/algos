package GS;

public class TrappingWater {
    public int trap(int[] height) {
        int lw = -1;
        int rw = -1;
        int l = 0;
        int r = height.length - 1;

        int result = 0;
        while (l <= r) {
            if (height[l] <= height[r]) {
                if (lw <= height[l])
                    lw = height[l];
                else
                    result += lw - height[l];
                l++;
            } else {
                if (rw <= height[r])
                    rw = height[r];
                else
                    result += rw - height[r];
                r--;
            }
        }

        return result;
    }
}
