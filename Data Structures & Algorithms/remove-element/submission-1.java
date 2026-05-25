class Solution {
    public int removeElement(int[] nums, int val) {

        ArrayList<Integer> tmp = new ArrayList<>();

        for (int n : nums) {
            if (val != n) {
                tmp.add(n);
            }
        }

        for (int i = 0; i < tmp.size(); i++) {
            nums[i] = tmp.get(i); 
        }

        int k = tmp.size();
        return k;
    }
}