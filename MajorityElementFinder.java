public class MajorityElementFinder {
    public static int findMajorityElement(int[] nums) {
        int majorityElement = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majorityElement) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                majorityElement = nums[i];
                count = 1;
            }
        }

        count = 0;
        for (int num : nums) {
            if (num == majorityElement) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return majorityElement;
        }

        throw new IllegalArgumentException("No majority element found");
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int majority = findMajorityElement(arr);
        System.out.println("Majority Element: " + majority);
    }
}
