import java.util.*;
import java.io.*;

public class Consecutive {

    public ArrayList Randomnize(ArrayList<Integer> num) {
	Random r = new Random();
	ArrayList<Integer> temp = new ArrayList<Integer>();
	for (int i = 0; i < 21; i++) {
	    int rand = r.nextInt(num.size());
	    temp.add(num.get(rand));
	    num.remove(rand);
	}
	return temp;
    }

    public String Randomnize(int[] nums) {
	Random r = new Random();
	int[] temp = new int[nums.length];
	for (int i = 0; i < 21; i++) {
	    int rand = r.nextInt(nums.length);
	    temp[i] = nums[rand];
	    int k = 0;
	    int[] temp2 = new int[nums.length - 1];
	    for (int j = 0; j < nums.length; j++) {
		if (j != rand) {
		    temp2[k] = nums[j];
		    k++;
		}
	    }
	    nums = temp2;
	}
	return toString(temp);
    }
    
    public String toString(int[] nums) {
	String Arraystring = "{";
	for (int i = 0; i < nums.length - 1; i++) {
	    Arraystring += nums[i] + ", ";
	}
	return Arraystring += nums[nums.length - 1] + "}";
    }

    public static void main(String[] args) {
	Consecutive a = new Consecutive();
	ArrayList<Integer> c = new ArrayList<Integer>();
	int[] nums = new int[21];
	for (int i = 0; i <= 20; i++) {
	    nums[i] = i;
	    c.add(i);
	}
	System.out.println(a.Randomnize(c));
	System.out.println(a.Randomnize(nums));
    }
}
