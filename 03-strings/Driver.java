public class Driver {
    public static void main (String[] args){
	String s = "mike zamansky";
        String first = s.substring(0, s.indexOf(" "));
	String last = s.substring(s.indexOf(" "));
	System.out.println("First name: " + first);
	System.out.println("Last name: " + last);
    }
}
