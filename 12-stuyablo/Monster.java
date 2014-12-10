public class Monster extends Basechar implements Comparable{
    int healthboost=(int)Math.ceil(Math.random()*400);
    public Monster (String n) {
	super(n);
	this.health = this.health + healthboost;
	this.attack = this.attack + (int)Math.ceil(Math.random()*5);
    }

    public String Comparable (Monster other) {
	if (other.name.compareTo(this.name) > 0) {
	    return other.name;
	}
	return this.name;
    }
    /*
      public void Attack (Basechar other) {
      System.out.println(this + " is attacking " + other + "!!!");
	}
    */
}

