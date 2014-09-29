public class stringStuff {
    public String makeAbba(String a, String b) {
	return a+b+b+a;
    }
    public String nonStart(String a, String b) {
	return a.substring(1) + b.substring(1);
    }
    //Working
    public int diff21(int n) {
	int diff = Math.abs(n - 21);
	if (n > 21) {
	    return diff * 2;
	}
	return diff;
    }
    //working
    public int teaParty(int tea, int candy) {
	if ((tea < 5) || (candy < 5)) {
            return 0;
	}
	if ((tea >= candy * 2) || (candy >= tea * 2)) {
	    return 2;
	}
	return 1;
    }
    //working
    public boolean lastDigit(int a, int b, int c) {
	return (a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c %10);
    }
    //working
    public boolean nearHundred(int n) {
	return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }
    //working
    public boolean mixStart(String str) {
	return (str.indexOf("ix") >= 0);
    }
}


