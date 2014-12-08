import java.util.*;

public class SuperArray {
    private String[] data;
    private int last;

    public SuperArray() {
        data = new String[0];
	last = 0;
    }

    public boolean add(String s){
	String[] data1 = new String[last + 1];
	for (int j = 0; j < last; j++) {
	    data1[j] = data[j];
	}
	data1[last] = s;
	data = data1;
	last++;
	return true;
    }
    
    public void add(int index, String s){
	try {
	    String[] data1 = new String[last + 1];
	    for (int j = 0; j < index; j++) {
		data1[j] = data[j];
	    }
	    data1[index] = s;
	    for (int j = index+1; j < last+1; j++) {
		data1[j] = data[j-1];
	    }
	    last++;
	    data = data1;
	} catch(Exception e) {
	    System.out.println("Error - we got " + e);
	}
    }
    
    public int size() {
        return last;
    }

    public String get(int index) {
        try {
	    return data[index];
	} catch(Exception e) {
	    System.out.println("Error - we got " + e);
	}
	return "Could not return string at specified index";
    }

    public String set(int index, String s){
	try {
	    String old = data[index];
	    data[index] = s;
	    return old;
	} catch(Exception e) {
	    System.out.println("Error - we got " + e);
	}
	return "Could not return string at specified index";
    }

    public String remove(int index){
	try {
	    String old = data[index];
	    String[] data1 = new String[last-1];
	    int j = 0;
	    for (int i = 0; i < last; i++) {
		if (i != index) {
		    data1[j] = data[i];
		    j++;
		}
	    }
	    data = data1;
	    last--;
	    return old;	
	} catch(Exception e) {
	    System.out.println("Error - we got " + e);
	}
	return "Could not return string at specified index";
    }

    public void isort() {
        for (int j = 1; j < size(); j++) {
            String newval = data[j];
	    int i;
	    for (i = j - 1; i > -1 && data[i].compareTo(newval) > 0; i--) {
                data[i+1] = data[i];
            }
            data[i+1] = newval;
        }
    }
    
    public void ssort() {
	for (int i = 0; i < size(); i++) {
	    String minstring = data[i];
	    String temp = "";
	    int oldpos = 0;
	    for (int j = i; j < size(); j++) {
		if (data[j].compareTo(minstring) <= 0) {
		    minstring = data[j];
		    oldpos = j;
		}
	    }
	    temp = data[i];
	    data[i] = minstring;
	    data[oldpos] = temp;
	}
    }

    public void bsort() {
	for (int i = 0; i < size() - 1; i++) {
	    for (int j = 0; j < size() - 1; j++) {
		if (data[j+1].compareTo(data[j]) < 0) {
		    String temp = data[j+1];
		    data[j+1] = data[j];
		    data[j] = temp;
		}
	    }
	}
    }

    public void builtin() {
	Arrays.sort(data);
    }

    /*

      Questions on sorting:
      1. What is the run time of the selection sort? .01 s
      2. What is the run time of the insertion sort? .012 s
      3. On what basis can you compare the two sorts?
         Is one better than another?

     */
	    

    public String toString() {
	String Arraystring = "{";
	for (int i = 0; i < data.length - 1; i++) {
	    Arraystring += data[i] + ", ";
	}
	return Arraystring + data[data.length -1] + "}";
    }

    public static void main(String[] args) {
	SuperArray s = new SuperArray();
	/*
	String[] data = new String[]{"hello", "there", "this", "is", "super", "unlike", "you", "suck", "whatever", "arrays", "blegh", "zebras", "derp", "dirt"};
	*/
	s.add("hello");
	s.add("there");
	s.add("this");
	s.add("is");
	s.add("a");
	s.add("superarray");
	System.out.println(s.toString());
	s.remove(2);
	s.add(1, "look");
       	System.out.println(s.toString());
	s.builtin(); //0.011s
	s.isort(); //0.011s
	s.ssort(); //0.010s
	s.bsort(); // 0.011s
	System.out.println(s.toString());
    }
}
