public class Cello extends String {

	private boolean Kickstand;

	public cello (String weight, String price, String maker, int numberStrings, boolean Kickstand) {

    super(weight, maker, price, noStrings);

    this.Kickstand = Kickstand;

	}

	public void output() {
		System.out.println("Cello facts: ");
		super.print();
		System.out.println("Kick Stand: " + Kickstand);
	}
}s
