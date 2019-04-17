public class Clarinet extends Woodwind {

	private String reed;

	public clarinet (String price, String weight, String maker, String mouthpiece, String reed) {
		super(price, weight, maker, mouthpiece);
		this.reed = reed;

	}

	public void output() {
		System.out.println("Clarinet facts: ");
		super.print();
		System.out.println("Reed: " + reed);
	}
}
