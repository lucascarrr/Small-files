public class Container {
    public static void main(String[] args) {
        int[] height = new int[]{2,3,4,5,18,17,6};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int area = 0;
        int left_ptr = 0;
        int right_ptr = height.length-1;

        for (int i = 0; i < (height.length); i++) {
            area = Math.max(area, Math.min(height[left_ptr], height[right_ptr]) * (right_ptr - left_ptr));
            if (height[left_ptr] > height[right_ptr]) {
                right_ptr -= 1; }
            else  left_ptr += 1;
        }

        return area;
    }
}
