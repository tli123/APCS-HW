public class Sarray {
    private Object[] data;
    private int pos;
    
    public Sarray() {
	data = new Object[10];
	pos = 0;
    }

    public Object get(int index) {
	return data[index];
    }

    public Object set(int index, Object i) {
	data[index] = i;
    }

    public int size() {
	return pos;
    }

    public Object[] remove(int index) {
	Object[] data1 = new Object[pos - 1];
	int j = 0;
	for (int i = 0; i < data.length; i++) {
	    if (i != index) {
		data1[j] = data[i];
		j++;
	    }
	}
	data = data1;
	pos--;
	return data;
    }
		
    public Object[] add(Object n) {
      	Object[] data1 = new Object[pos + 1];
	for (int i = 0; i < data.length; i++) {
	    data1[i] = data[i];
	}
	data1[pos+1] = n;
	pos++;
	data = data1;
	return data;
    }

    public Object[] addlocation(Object n, int index) {
      	Object[] data1 = new Object[pos + 1];
	int j = 0;
	for (int i = 0; i < data.length; i++) {
	    if (i != index) {
		data1[j] = data[i];
		j++;
	    }
	    else {
		data1[j] = n;
		data1[j+1] = data[i];-
		j += 2;
	}
    }
}
