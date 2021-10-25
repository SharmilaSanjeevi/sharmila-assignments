package interfaceAssignment;

public class Scientific extends Basic implements ScientificCalculator {

	@Override
	public void square(int x) {
		// TODO Auto-generated method stub

		System.out.println(" Square : " + (x * x));

	}

	@Override
	public void cube(int x) {
		// TODO Auto-generated method stub

		System.out.println(" Cube : " + (x * x * x));

	}

}
