public class Sarray {
    private Object[] data;
    private int last;

    public Sarray() {
        data = new Object[0];
	last = 0;
    }

    public boolean add(Object i){
	Object[] data1 = new Object[last + 1];
	for (int j = 0; j < last; j++) {
	    data1[j] = data[j];
	}
	data1[last] = i;
	data = data1;
	last++;
	return true;
    }
    
    public void add(int index, Object i){
	try {
	    Object[] data1 = new Object[last + 1];
	    for (int j = 0; j < index; j++) {
		data1[j] = data[j];
	    }
	    data1[index] = i;
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

    public Object get(int index) {
        try {
	    return data[index];
	} catch(Exception e) {
	    System.out.println("Error - we got " + e);
	}
    }

    public Object set(int index, Object i){
	try {
	    Object old = data[index];
	    data[index] = i;
	    return old;
	} catch(Exception e) {
	    System.out.prinln("Error - we got " + e);
	}
    }

    public Object remove(int index){
	try {
	    Object old = data[index];
	    Object[] data1 = new Object[last-1];
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
    }

    public String toString() {
	String Arraystring = "{";
	for (int i = 0; i < data.length - 1; i++) {
	    Arraystring += data[i] + ", ";
	}
	return Arraystring + data[data.length -1] + "}";
    }

    public static void main(String[] args) {
	Sarray s = new Sarray();
	System.out.println(s.add(7));
	System.out.println(s.add(true));
	System.out.println(s.add("Zamansky"));
	System.out.println(s.add(9.2313));
	System.out.println("Added 4 elements: " + s.toString());
	s.add(1, 'd');
	System.out.println("Added 'd' in index 1, pushed other indexes: " + s.toString());
	s.add(4, "yoloswag");
	System.out.println("Added " + "yoloswag" +" to index 4 :" + s.toString());
	System.out.println(s.remove(2));
	System.out.println("Removed index 2: " + s.toString());	
	System.out.println(s.remove(0));
	System.out.println("Removed index 0: " + s.toString());
    }
}
