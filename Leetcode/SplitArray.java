public class SplitArray {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5};
        int k = 1;
        System.out.println(splitArray(nums,k));
    }

    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length ; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        // binary search
        while (start < end) {
            int mid = start + (end - start) / 2;
            // divide into pieces and sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}
