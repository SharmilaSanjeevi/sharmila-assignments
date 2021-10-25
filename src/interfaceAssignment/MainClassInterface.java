package interfaceAssignment;

public class MainClassInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicCalculator calc = new Basic();
		calc.add(50, 50);
		calc.difference(200, 50);
		calc.product(100, 2);
		calc.divide(500, 2);

		System.out.println();

		calc = new Scientific();
		calc.add(100, 100);
		calc.difference(400, 100);
		calc.product(200, 2);
		calc.divide(1000, 2);

		System.out.println();

		ScientificCalculator calci = new Scientific();
		calci.add(1000, 1000);
		calci.difference(5000, 2000);
		calci.product(5000, 5000);
		calci.divide(200000, 2);

	}

}
