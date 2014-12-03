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

    public void sort() {
	for (int j = 0; j < last; j++) {
	    String[] a = new String[j];
	    for (int k = 0; k <= j; k++) :
		a[k] = data[k];
	for (int i = last - 1; i > 0 && n < data[i-1]; i--) {

	}
    }

    public String toString() {
	String Arraystring = "{";
	for (int i = 0; i < data.length - 1; i++) {
	    Arraystring += data[i] + ", ";
	}
	return Arraystring + data[data.length -1] + "}";
    }

    public static void main(String[] args) {
	SuperArray s = new SuperArray();
	s.add("Hello");
	s.add("there");
	s.add("this");
	s.add("is");
	s.add("an");
	s.add("superarray");
	System.out.println(s.toString());
	s.remove(2);
	s.add(1, "look");
	System.out.println(s.toString());
    }
}
