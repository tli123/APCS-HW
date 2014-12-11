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

    /*
      public void Attack (Basechar other) {
      System.out.println(this + " is attacking " + other + "!!!");
	}
    */
}

