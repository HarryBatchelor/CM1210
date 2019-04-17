public class Tuba extends Brass {

	public tuba (String price, String weight, String maker, String material) {
		super(price, weight, maker, material);

	}

	public void print() {
		System.out.println("Tuba facts: ");
		super.print();
	}
}
