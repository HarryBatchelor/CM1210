public class Triangle extends Percussion {

	private String note;

	public triangle (String price, String weight, String maker, boolean pitched, String note) {
		super(price, weight, maker, pitched);
		this.note = note;

	}

	public void print() {
		System.out.println("Traingle Facts: ");
		super.print();
		System.out.println("Singlenote: " + note);
	}
}
