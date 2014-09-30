public class whileloops {
    //2 minutes
    public String frontTimes(String str, int n) {
	int s = 0;
	if (str.length() < 3) {
	    s = s + str.length();
	}
	else {
	    s = s + 3;
	}
	String copies = "";
	int x = 1;
	while (x <= n) {
	    copies = copies + str.substring(0, s);
	    x++;
	}
	return copies;
    }
    //2 minutes
    public String stringBits(String str) {
	String bits = "";
	int x = 0;
	while (x <= (str.length() - 1)) {
	    bits = bits + str.substring(x, x+1);
	    x = x + 2;
	}
	return bits;
    }
    //5 minutes
    public int stringMatch(String a, String b) {
	int shorter = Math.min(a.length(), b.length());
	int x = 0;
	int pos = 0;
	while (x < (shorter - 1)) {
	    String suba = a.substring (x, (x+2));
	    String subb = b.substring (x, (x+2));
	    if (suba.equals(subb)) {
		pos = pos + 1;
	    }
	    x = x + 1;
	}
	return pos;
    }
    //5 minutes
    public String stringYak(String str) {
	String yak = "";
	int x = 0;
	while (x < str.length()) {
	    if (((x + 2) < str.length()) &&(str.charAt(x) == 'y') && (str.charAt(x + 2) == 'k')) {
		x = x + 3;
	    }
	    else {
		yak = yak + str.charAt(x);
		x = x + 1;
	    }
	}
	return yak;
    }
}
