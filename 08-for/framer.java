public class framer {
    public String frame(int r, int c) {
	String frames = "";
        String topedge = "";
	String sides = "";
	for (int i=0; i<c; i++){
	    topedge = topedge + "*";
	}
	topedge = topedge + "\n";
	int diff = (c - 2);
	sides = sides + "*";
	for (int i=0; i<diff; i++){
	    sides = sides + " ";
	}
	sides = sides + "*\n";
	frames = frames + topedge;
	for (int i=0; i<(r-2); i++){
	    frames = frames + sides;
	}
	return (frames + topedge);
    }
    public String stringSplosion(String str) {
	String res = "";
	for (int i=0; i<=str.length(); i++) {
	    res =  res + str.substring(0, i);
	}
	return res;
    }
    public String stringX(String str) {
	String res = "";
	for (int i = 0; i < str.length(); i++) {
	    if ((i > 0 && i < (str.length()-1) && str.charAt(i) == 'x') == false) {
		res = res + str.substring(i, (i + 1));
	    }
	}
	return res;
    }
}
