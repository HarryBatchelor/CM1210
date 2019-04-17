public class Trumpet extends Brass {

	private String mute;

	public trumpet (String price, String maker, String weight, String class, String mute) {
		super(price, maker, weight, class);
		this.mute = mute;

	}

	public void output() {
		System.out.println("Trumpet Facts: ");
		super.print();
		System.out.println("Mute: " + mute);
	}
}
