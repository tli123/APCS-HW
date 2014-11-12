import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<Integer>();
	Random r = new Random();
	for (int i = 0; i < 20; i++) {
	    a.add(r.nextInt(10));
	}
	System.print.ln(a);
	for (int i = 0; i < a.size() - 1; i++) {
	    if (a.get(i) == a.get(i+1)) {
		a.remove(i+1);
		i--;
	    }
	}
	System.out.println(a);
    }
}
