package studio7;

public class Die {
	
	private int n;
	
	public Die(int sides) {
		n = sides;
	}
	
	public int roll() {
		int roll = (int)(Math.random()*n) + 1;
		return roll;
	}
	
	public static void main(String[] args) {
		Die d1 = new Die(6);
		System.out.print(d1.roll());
	}

}
