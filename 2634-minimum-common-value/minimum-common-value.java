class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int low=0,left=0;
        while(low<nums1.length && left<nums2.length){
            if(nums1[low] == nums2[left]) return nums1[low];
            else if(nums1[low]>nums2[left]) left++;
            else low++;
        }
        return -1;
    }
}