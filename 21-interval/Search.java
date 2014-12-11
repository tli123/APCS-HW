import java.util.*;
import java.io.*;

public class Search {

    private static int[] nums;

    public Search() {
	nums = new int[50];
	for (int i = 0; i < 50; i++) {
	    Random r = new Random();
	    nums[i] = r.nextInt(50);
	}
	Arrays.sort(nums);
    }
    
    public static Object lsearch(int num) {
	for (int i = 0; i < nums.length; i++) {
	    if (num == nums[i]) {
		return num;
	    }
	}
	return null;
    }

    public static Object bsearch(int num) {
	int low = 0;
	int high = nums.length - 1;
	while (low < high) {
	    int mid = (low + high) / 2;
	    if (num < nums[mid]) {
		high = mid - 1;
	    }
	    else if (num > nums[mid]) {
		low = mid + 1;
	    }
	    else {
		return num;
	    }
	}
	return null;
    }

    public static String ToString() {
	String a = "[";
        for (int i = 0; i < nums.length - 1; i++) {
	    a = a + nums[i] + ", ";
	}
	return a + nums[nums.length - 1] + "]";
    }

    public static void main(String[] args) {
	Search s = new Search();
	System.out.println(s.ToString());
	System.out.println(lsearch(20));
	System.out.println(bsearch(20));
    }
}
