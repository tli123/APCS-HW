import java.util.*;
import java.io.*;

public class MoreArrayfun {
    
    private int[] nums;
    public MoreArrayfun() {
	nums = new int[100];
	for (int i = 0; i < 100; i++) {
	    nums[i] = (int)((Math.random() * 10) + 1);
	}
    }

    public int frequency(int n) {
	int counter = 0;
	for (int i = 0; i < nums.length; i++){
	    if (nums[i] == n) {
		counter += 1;
	    }
	}
	return counter;
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

    public String toString(int[] nums, int len) {
	String arraystring = "The array is: {";
	for (int i = 0; i<len; i++) {
	    arraystring += nums[i];
	    if (i!= (len -1)) {
		arraystring += ", ";
	    }
	}
	arraystring += "}";
	return arraystring;
    }

    public int sum67() {
	int sum = 0;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] != 6) {
		sum += nums[i];
	    }
	    if (nums[i] == 6) {
		int counter = 0;
		for (int x = i; x < (nums.length -1); x += 1) {
		    if (nums[x] != 7) {
			counter += 1;
		    }
		    if (nums[x] == 7) {
			if (nums[x+1] != 7) {
			    break;
			}
		    }
		}
		i += counter;
	    }
	}
	return sum;
    }

    public boolean more14() {
	int counter1 = 0;
	int counter4 = 0;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 1) {
		counter1 += 1;
	    }
	    if (nums[i] == 4) {
		counter4 += 1;
	    }
	}
	return (counter1 > counter4);
    }

    public String tenRun() {
	for(int i = 0; i < nums.length;i++) {
	    if (nums[i] % 10 == 0) {
		for (int k = i + 1; k < nums.length && nums[k] % 10 != 0 ; k++) {
		    nums[k] = nums[i];
		}
	    }
	}
	return toString(nums, nums.length);
    }

    public boolean tripleUp() {
	boolean triple = false;
	for (int i = 0; i < (nums.length - 2); i++) {
	    if ((nums[i] == (nums[i+1] - 1)) && (nums[i] == (nums[i+2] - 2))) {
		triple = true;
		return triple;
	    }
	}
	return triple;
    }

    public boolean canBalance() {
	int sum1 = 0;
	int sum2 = 0;
	for (int i = 0; i < nums.length; i++) {
	    for (int j = 0; j < nums.length; j++) {
		if (j > i) {
		    sum1 += nums[j];
		}
		else {
		    sum2 += nums[j];
		}
	    }
	    if (sum1 == sum2) {
		return true;
	    }
	}
	return false;
    }

    public String seriesUp(int n) {
	int len = (n * (n + 1))/2;
	int k = 0;
	int[] numbers = new int[len];
	for (int i = 1; i <= n; i++) {
	    for (int j = 1; j <= i; j++) {
		numbers[k] = j;
		k++;
	    }
	}
	return toString(numbers, len);
    }
}
