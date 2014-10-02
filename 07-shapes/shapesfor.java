public class shapesfor{
    public String Tri3(int h) {
	String res = "";
	for (int counter = 0; counter < h; counter++) {
	    int length = ((h + (h - 1)) - (counter + (counter -1)));
	    int mid = (length / 2);
	    for (int count = 0; count < mid; count++) {
		res = res + " ";
	    }
	    for (int starcount = 0; starcount < (counter + (counter - 1)); starcount++) {
		res = res + "*";
	    }
	    for (int scount = 0; scount < mid; scount ++){
		res = res + " ";
	    }
	    res = res + "\n";
	}
	return res;
    }
    public String diamond(int h) {
	if ((h%2) == 0) {
	    return "Invalid input";
	}
	int mid = (((h-1)/2) + 1);
        String res = Tri3(mid);
	int med = mid;
	for (int len = h; len > mid; len = len - 1) {
	    med = med - 1;
	    int spaces = (((2*mid)-1) - ((2*med)-1));
	    spaces = (spaces / 2);
	    for (int spacecount = 0; spacecount < spaces; spacecount++) {
		res = res + " ";
	    }
	    for (int starcount = 0; starcount < ((2 * med) -1); starcount++) {
		res = res + "*";
	    }
	    for (int scount = 0; scount < spaces; scount++) {
		res = res + " ";
	    }
	    res = res + "\n";
	}
	return res;
    }
     public String Tri4(int h) {
	String res = "";
	for (int counter = h; counter  >  0; counter = counter -1){
	    int diff = (h - counter);
	    for (int c = 0; c  < diff; c++){
		res = res + " ";
	    }
	    for (int d = 0; d < counter; d++) {
		res = res + "*";
	    }
	    res = res + "\n";
	}
	return res;
     }
}
