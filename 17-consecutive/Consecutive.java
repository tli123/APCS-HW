import java.util.*;
import java.io.*;

public class Consecutive {

    private int[] nums;
    private ArrayList<Integer> num;
    private ArrayList<Integer> temp;

    public Consecutive(int n) {
	nums = new int[n + 1];
	for (int i = 0; i <= n; i++) {
	    nums[i] = i;
	    num.add(i);
	}
    }
    
    public void SpaceEfficient() {
	for (int i = 0; i < num.size(); i++) {
	    int x = (int)(Math.random() * num.size() + 1);
	    temp.add(num.get(x));
	}
    }

    public static void main(String[] args) {
	Consecutive c = new Consecutive(10);
	c.SpaceEfficient();
	System.out.println(c);
    }
}
