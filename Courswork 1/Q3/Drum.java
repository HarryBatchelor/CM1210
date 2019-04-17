public class Drum extends Percussion {

	private String drumType;

	public drum (String maker, String price, String weight, boolean pitched, String drumType) {
		super(maker, price, weight, pitched);
		this.drumhead = drumType;

	}

	public void print() {
		System.out.println("Drum Facts: ");
		super.print();
		System.out.println("Drum type: " + drumType);
	}
}
