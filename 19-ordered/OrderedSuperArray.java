import java.util.*;

public class OrderedSuperArray extends SuperArray {
    public String[] data;
    public int last;

    public OrderedSuperArray() {
	super();
    }
    
    public void adding(String s) {
	add(s);
	Arrays.sort(data);
    }

    public static void main(String[] args) {
	OrderedSuperArray s = new OrderedSuperArray();
	s.adding("hello");
	s.adding("look");
	s.adding("apple");
	s.toString();
    }

}
