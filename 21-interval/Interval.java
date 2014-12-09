import java.util.*;
import java.io.*;

public class Interval {

    private double low, high;
    private Random r;

    public Interval() {
	Random r = new Random();
	double num = r.nextDouble() + r.nextInt();
	double nums = r.nextDouble() + r.nextInt();
	double[] inter = new double[2];
	low = Math.min(num, nums);
	high = Math.max(num, nums);
	inter[0] = low;
	inter[1] = high;
    }

    public String toString() {
        return "[" + low + ", " + high + "]";
    }

    public static void main(String[] args) {
	Interval[] s = new Interval[5];
	for (int a = 0; a < 5; a++) {
	    Interval i = new Interval();
	    System.out.println(i.toString());
	    s[a] = i;
	}	    
    }

}
