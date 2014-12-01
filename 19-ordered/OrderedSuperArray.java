import java.util.*;

public class OrderedSuperArray extends SuperArray {
    public Object[] data;
    public int last;

    public OrderedSuperArray() {
	super();
    }

    public void adding(Object obj) {
	boolean x = add(obj);
	Arrays.sort(data);
    }

    public static void main(String[] args) {
	OrderedSuperArray s = new OrderedSuperArray();
	s.adding("computers");
	s.adding("Zamasky");
	s.adding("hello");
    }
}
