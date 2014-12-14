import java.util.*;
import java.io.*;

public class Searching {
    
    private static Comparable[] a;
    private int low;
    private int high;

    public Searching(int n) {
	a = new Comparable[n];
	low = 0;
	high = n - 1;
    }

    public void additem(Comparable item) {
	Comparable[] temp = new Comparable[a.length + 1];
	for (int i = 0; i < a.length; i++) {
	    temp[i] = a[i];
	}
	temp[temp.length - 1] = item;
	a = temp;
    }

    public void sort() {
	Arrays.sort(a);
    }

    public Object lsearch(Comparable item) {
	for (int i = 0; i < a.length; i++) {
	    if (item.compareTo(a[i]) == 0) {
		return a[i];
	    }
	}
	return null;
    }

    public Object bsearch(Comparable item) {
	while (low < high) {
	    int mid = (low + high) / 2;
	    if (item.compareTo(a[mid]) < 0) {
		high = mid - 1;
	    }
	    else if (item.compareTo(a[mid]) > 0) {
		low = mid + 1;
	    }
	    else {
		low = 0;
		high = a.length - 1;
		return item;
	    }
	}
	low = 0;
	high = a.length - 1;
	return null;
    }

    
    public Object rsearch(Comparable item) {
	if (low < high) {
	    int mid = (low + high) / 2;
	    if (item.compareTo(a[mid]) < 0) {
		high = mid - 1;
		rsearch(item);
	    }
	    else if (item.compareTo(a[mid]) > 0) {
		low = mid + 1;
		rsearch(item);
	    }
	    else {
		low = 0;
		high = a.length - 1;
		return item;
	    }
	}
	low = 0;
	high = a.length - 1;
	return null;
    }
    

    public String toString() {
	String Array = "[";
	for (int i = 0; i < a.length - 1; i++) {
	    Array = Array + a[i] + ", ";
	}
	return Array + a[a.length - 1] + "]";
    }

    public static void main(String[] args) {
	Searching s = new Searching(20);
	for (int i = 0; i < a.length; i++) {
	    Random r = new Random();
	    a[i] = r.nextInt(50);
	}
	for (int i = 0; i < 10; i++) {
	    Random r = new Random();
	    s.additem(r.nextInt(25));
	}
	s.sort();
	System.out.println(s.toString());
	System.out.println("Linear Search for 7: " + s.lsearch(7));
	System.out.println("Binary Search for 3: " + s.bsearch(3));
	System.out.println("Recursion Search for 29: " + s.rsearch(29));
    }
}
	
