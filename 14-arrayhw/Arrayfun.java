public class Arrayfun {
    public int maxnum;

    public int find(int[] nums, int n) {
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == n) {
		return i;
	    }
	}
	return -1;
    }
    
    public int maxval(int[] nums) {
	for (int i = 0; i < (nums.length - 1); i++) {
	    maxnum = Math.max(nums[i], nums[i+1]);
	}
	return maxnum;
    }
}
