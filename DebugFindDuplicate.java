import java.util.*;

public class DebugFindDuplicate {

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums1 = {1, 3, 4, 2, 2};
        int[] nums2 = {3, 1, 3, 4, 2};

        System.out.println("Duplicate in nums1: " + sol.findDuplicate(nums1));
        System.out.println("Duplicate in nums2: " + sol.findDuplicate(nums2));
    }
}

class Solution {
    public int findDuplicate(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];
        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            // System.out.println("slow=" + slow + " fast=" + fast);

            if (slow == fast) {
                break;
            }
        }
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
            // System.out.println("slow=" + slow + " fast=" + fast);
        }

        return slow;
    }
}
