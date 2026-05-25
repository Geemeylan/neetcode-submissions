class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int countOnes = 0;
        int maxOnes = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                countOnes++;
                
                if (countOnes > maxOnes) {
                    maxOnes = countOnes;
                }
            } else {
                countOnes = 0;
            }
        }
        return maxOnes;
    }
}