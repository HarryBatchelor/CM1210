public class Violin extends String {

	private String bow;

	public violin (String price, String weight, String maker, int numberStrings, String bow) {
		super(price, weight, maker, numberStrings);
		this.bow = bow;

	}

	public void output() {
		System.out.println("Violin Facts: ");
		super.print();
		System.out.println("Chinrest: " + bow);
	}
}
