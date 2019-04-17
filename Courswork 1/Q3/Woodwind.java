public class Woodwind extends Instrument {

	private String mouthpiece;

	public woodwind (String price, String weight, String maker, String mouthpiece) {
		super(price, weight, maker);
		this.mouthpiece = mouthpiece;
	}

	public void output() {
		super.print();
		System.out.println("Mouthpiece: " + mouthpiece);
	}
}
