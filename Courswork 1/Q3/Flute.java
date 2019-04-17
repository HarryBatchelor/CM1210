public class Flute extends Woodwind {

	private String size;

	public flute (String price, String weight, String maker, String mouthpiece, String size) {
		super(price, weight, maker, mouthpiece);
		this.size = size;

	}

	public void output() {
		System.out.println("Flute Facts: ");
		super.print();
		System.out.println("Size: " + size);
	}
}
