public class Percussion extends Instruments {

	private boolean pitched;

	public percussion (String price, String weight, String maker, boolean pitched) {
		super(price, weight, maker);
		this.pitched = pitched;
	}

	public void output() {
		super.print();
		System.out.println("Pitched: " + pitched);
	}
}
