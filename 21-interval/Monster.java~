import java.io.*;
import java.util.*;

public class Monster extends Basechar implements Comparable{
    int healthboost=(int)Math.ceil(Math.random()*400);
    public Monster (String n) {
	super(n);
	this.health = this.health + healthboost;
	this.attack = this.attack + (int)Math.ceil(Math.random()*5);
    }

    public int compareTo(Object other) {
	Monster o = (Monster)other;
	return (int)this.getName().charAt(0) - (int)o.getName().charAt(0);  
    }					      

    public static void main(String[] args) {
	/*
	  Does not compile
	  1. Basechar.toString is not appliable, actual + formal arguements
	     differ in length
	  2. .size has private access to ArrayList
	  Note: Monster.java uses unchecked or unsafe operations.
	  Note: Recompile with -Xlinr:unchecked for details
	 */
	
        ArrayList<String> names = new ArrayList<String>();
	names.add("Teacher");
	names.add("Student");
	names.add("Grinch");
	names.add("Wolf");
	names.add("Mafia");
        ArrayList<Monster> monsters = new ArrayList<Monster>();
	for (int i = 0; i < 5; i++) {
	    Random r = new Random();
	    int pos = r.nextInt(5);
	    Monster a = new Monster(names.get(pos));
	    monsters.add(a);
	    names.remove(pos);
	}

	String s = "[";
	for (int i = 0; i < monsters.size - 1; i++){
	    s = s + monsters.get(i) + ", ";
	}
	return s + monsters.get(4) + "]";
	System.out.println(s);
	Collections.sort(monsters);

	String x = "[";
	for (int i = 0; i < monsters.size - 1; i++){
	    x = x + monsters.get(i) + ", ";
	}
	return x + monsters.get(4) + "]";
	System.out.println(toString(x));
	
    }

    /*
      public void Attack (Basechar other) {
      System.out.println(this + " is attacking " + other + "!!!");
	}
    */
}

