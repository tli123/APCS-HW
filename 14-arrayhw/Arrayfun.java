public class Arrayfun {
    private int maxnum;
    private int[] nums;

    public Arrayfun() {
        nums = new int[100];
	for (int i = 0; i < 100; i++) {
	    nums[i] = (int)(Math.random() * 50 + 1);
	}
    }
    
    public int find(int n) {
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == n) {
		return i;
	    }
	}
	return -1;
    }
    
    public int maxval() {
	for (int i = 0; i < (nums.length - 1); i++) {
	    maxnum = Math.max(nums[i], nums[i+1]);
	}
	return maxnum;
    }

    public String toString() {
	String arraystring = "The array is: {";
	for (int i = 0; i<100; i++) {
	    arraystring += nums[i];
	    if (i!= 99) {
		arraystring += ", ";
	    }
	}
	arraystring += "}";
	return arraystring;
    }
}
