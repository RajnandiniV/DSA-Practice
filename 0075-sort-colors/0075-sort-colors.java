class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];

        
        for (int num : nums) {
            count[num]++;
        }

        int index = 0;

        
        while (count[0] > 0) {
            nums[index++] = 0;
            count[0]--;
        }

        
        while (count[1] > 0) {
            nums[index++] = 1;
            count[1]--;
        }

        while (count[2] > 0) {
            nums[index++] = 2;
            count[2]--;
        }
    }
}