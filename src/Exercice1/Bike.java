package Exercice1;

public class Bike extends Car{

	private Discount disc ;
	public Bike(String brand, long value) {
		super(brand, value);
	}
	public Bike(String Brand, Discount d) {
		super(Brand, 100);
		this.disc = d;
	}
	public String getBrand() {
		return Brand;
	}
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Bike)) {
			return false;
		}

		return super.equals(o);
	}
	@Override
	public String toString() {
		return "Vélo:" + super.Brand + ", de valeur : " + String.valueOf(super.getValue());
	}
	
}
