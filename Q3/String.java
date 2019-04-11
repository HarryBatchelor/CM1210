public class String extends Instruments {

	private int numberStrings;

	public String (String price, String weight, String maker, int numberStrings) {
		super(price, weight, maker);
		this.numberStrings = numberStrings;
	}

	public void output() {
		// super.print();
		System.out.println("Number of Strings: " + numberStrings);
	}
}
