package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}
	
	public Fraction add(Fraction otherFraction) {
		int n = numerator*otherFraction.denominator + otherFraction.numerator*denominator;
		int d = denominator*otherFraction.denominator;
		Fraction sum = new Fraction(n,d);
		return sum;
	}
	
	public Fraction multiply(Fraction otherFraction) {
		int n = numerator * otherFraction.numerator;
		int d = denominator * otherFraction.denominator;
		Fraction product = new Fraction(n,d);
		return product;
	}
	
	public Fraction reciprocal() {
		Fraction reciprocal = new Fraction(denominator, numerator);
		return reciprocal;
	}
	
	public Fraction simplify() {
		int gcf = findGCF(numerator, denominator);
		int n = numerator / gcf;
		int d = denominator / gcf;
		Fraction simplified = new Fraction(n,d);
		return simplified;
	}
	
	public static int findGCF(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	public void print() {
		System.out.println(numerator + "/" + denominator);
	}
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(3,4);
		Fraction sum = f1.add(f2);
		Fraction product = f1.multiply(f2);
		Fraction simplifiedSum = sum.simplify();
		sum.print();
		simplifiedSum.print();
		product.print();
	}

}
