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
	    int d = 0;
	    while (d < counter) {
		res = res + "*";
		d = d + 1;
	    }
	    res = res + "\n";
	    counter = counter + 1;
	}
	return res;
    }
    public String Tri3(int h) {
	int counter = 1;
	String res = "";
	while (counter <= h) {
	    int length = ((h + (h - 1)) - (counter + (counter -1)));
	    int mid = (length / 2);
	    int count = 0;
	    while (count < mid) {
		res = res + " ";
		count = count + 1;
	    }
	    int starcount = 0;
	    while (starcount < (counter + (counter - 1))) {
		res = res + "*";
		starcount = starcount + 1;
	    }
	    int scount = 0;
	    while (scount < mid){
		res = res + " ";
		scount = scount + 1;
	    }
	    res = res + "\n";
	    counter = counter + 1;
	}
	return res;
    }
    public String diamond(int h) {
	if ((h%2) == 0) {
	    return "Invalid input";
	}
	int mid = (((h-1)/2) + 1);
        String res = Tri3(mid);
	int len = h;
	int med = mid;
	while (len > mid) {
	    med = med - 1;
	    int spaces = (((2*mid)-1) - ((2*med)-1));
	    spaces = (spaces / 2);
	    int spacecount = 0;
	    while (spacecount < spaces) {
		res = res + " ";
		spacecount = spacecount + 1;
	    }
	    int starcount = 0;
	    while (starcount < ((2 * med) -1)) {
		res = res + "*";
		starcount = starcount + 1;
	    }
	    int scount = 0;
	    while (scount < spaces) {
		res = res + " ";
		scount = scount + 1;
	    }
	    res = res + "\n";
	    len = len - 1;
	}
	return res;
    }
    public String Tri4(int h) {
	int counter = h;
	String res = "";
	while (counter >  0){
	    int c = 0;
	    int diff = (h - counter);
	    while (c < diff){
		res = res + " ";
		c = c + 1;
	    }
	    int d = 0;
	    while (d < counter) {
		res = res + "*";
		d = d + 1;
	    }
	    res = res + "\n";
	    counter = counter - 1;
	}
	return res;
    }
}
