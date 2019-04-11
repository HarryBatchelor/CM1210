import java.util.*;
import java.io.*;
public class Instruments {
	private String weight;
  private String price;
	private String maker;
	public static void main(String[] args) {
		System.out.println("Courswork Question 3. Hierarchical Inheritance");
	}
	public Instruments (String weight, String price, String maker) {
		this.price = price;
		this.weight = weight;
		this.maker = maker;
	}
	protected final String getprice(){
		return this.price;
	}

	protected final String getweight(){
		return this.weight;
	}
  protected final String getmaker(){
		return this.maker;
	}
	public void setmaker(String instrmaker){
		this.maker = instrmaker;
	}
	public void setprice(String instrprice){
		this.price = instrprice;
	}

	public void setweight(String instrweight){
		this.weight = instrweight;
	}

	public void output() {
		System.out.println("maker: " + maker);
		System.out.println("Price: " + price);
		System.out.println("weight: " + weight);
	}
}
