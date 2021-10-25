package interfaceAssignment;

public class Basic implements BasicCalculator {

	@Override
	public void add(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(" Sum : " + (x + y));

	}

	@Override
	public void difference(int x, int y) {
		// TODO Auto-generated method stub

		System.out.println(" Difference : " + (x - y));

	}

	@Override
	public void product(int x, int y) {
		// TODO Auto-generated method stub

		System.out.println(" Product : " + (x * y));

	}

	@Override
	public void divide(int x, int y) {
		// TODO Auto-generated method stub

		System.out.println(" Divide : " + (x / y));
	}

}
