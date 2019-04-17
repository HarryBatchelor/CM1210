public class brass extends Instruments {

	private String class;

	public brass (String price, String weight, String maker, String class) {
		super(price, weight, maker);
		this.class = type;
	}

	public void output() {
		super.print();
		System.out.println("Type: " + type);
	}
}
