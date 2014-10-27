public class Driver {
    public static void main(String[] args) {
	Arrayfun s = new Arrayfun();
	System.out.println(s.find({2, 3, 1, 4, 2, 193, 21, 232}, 3));
	System.out.println(s.find({3, 2, 1, 3, 1, 3, 1, 3, 4, 1}, 5));
	System.out.println(s.maxval({2, 3, 4, 2, 98232, 123342, 324223423}));
    }
}
