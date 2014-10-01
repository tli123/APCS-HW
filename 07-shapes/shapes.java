public class shapes {
    public String box(int a, int b){
	int cc = 0;
	String boxy = "";
	while (cc < b){
	    int rc = 0;
	    while (rc < a) {
		boxy = boxy + "*";
		rc = rc + 1;
	    }
	    boxy = boxy + "\n";
	    cc = cc + 1;
	}
	return boxy;
    }
    public String Tri1(int a) {
	int counter = 1;
	String res = "";
	while (counter <= a){
	    int c = 1;
	    while (c < counter){
		res = res + "*";
		c = c + 1;
	    }
	    res = res + "\n";
	    counter = counter + 1;
	}
	return res;
    }
    public String Tri2(int a) {
	int counter = 1;
	String res = "";
	while (counter <= a){
	    int c = 0;
	    int diff = (a - counter);
	    while (c < diff){
		res = res + " ";
		c = c + 1;
	    }
	    int d = 1;
	    while (d <= counter) {
		res = res + "*";
		d = d + 1;
	    }
	    res = res + "\n";
	    counter = counter + 1;
	}
	return res;
    }
}
