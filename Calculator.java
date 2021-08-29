package Week3.day1;

public class Calculator {

	public int add(int a, int b) {
		int sum;
		sum = a + b;
		return (sum);
	}

	public int add(int a, int b, int c) {
		int sum;
		sum = a + b + c;
		return (sum);
	}

	public int multiply(int a, int b) {
		int product;
		product = a * b;
		return (product);
	}

	public double multiply(int a, double b) {
		double product;
		product = a * b;
		return (product);
	}

	public int sub(int a, int b) {
		int minus;
		minus = a - b;
		return (minus);
	}

	public double sub(double a, double b) {
		double minus;
		minus = a - b;
		return (minus);
	}

	public float divide(int a, int b) {
		float div;
		div = a / b;
		return (div);
	}

	public double divide(double a, int b) {
		double div;
		div = a / b;
		return (div);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator obj = new Calculator();
		int add1 = obj.add(5, 10);
		int add2 = obj.add(5, 10, 15);
		int multiply1 = obj.multiply(2, 3);
		int multiply2 = obj.multiply(4, 9);
		float divide1 = obj.divide(4, 2);
		float divide2 = obj.divide(45, 5);
		int sub1 = obj.sub(5, 10);
		int sub2 = obj.sub(20, 15);

		System.out.println("The addition of first method is " + add1);
		System.out.println("The addition of Second method is " + add2);
		System.out.println("The subtraction of first method is " + sub1);
		System.out.println("The subtraction of Second method is " + sub2);
		System.out.println("The Division of first method is " + divide1);
		System.out.println("The Division of Second method is " + divide2);
		System.out.println("The multiplication of first method is " + multiply1);
		System.out.println("The multiplication of Second method is " + multiply2);
	}

}
