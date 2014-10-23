public class Arrayfun {
    public int[] frontPiece(int[] nums) {
	if (nums.length < 3) {
	    return nums;
	}
	int[] news = new int[2];
	news[0] = nums[0];
	news[1] = nums[1];
	return news;
    }
    public int sum13(int[] nums) {
	int sum = 0;
	for (int i=0;i<nums.length;i++) {
	    if (nums[i] != 13) {
		sum = sum + nums[i];
	    }
	    else if ((nums[i] == 13) && (i < (nums.length -1))) {
		i++;
	    }
	}
	return sum;
    }
}
